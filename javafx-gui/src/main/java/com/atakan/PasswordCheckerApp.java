package com.atakan;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class PasswordCheckerApp extends Application {

    private final ProgressBar strengthBar = new ProgressBar(0);
    private final Label strengthLabel = new Label("Strength: —");
    private final Label verdictLabel = new Label("Type a password…");
    private final TextArea feedbackArea = new TextArea();

    @Override
    public void start(Stage stage) {
        // Title
        Label title = new Label("🔐 Password Strength Checker");
        title.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

        // Input (hidden/visible)
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Enter password...");

        TextField visibleField = new TextField();
        visibleField.setPromptText("Enter password...");
        visibleField.setManaged(false);
        visibleField.setVisible(false);

        // Keep values in sync
        visibleField.textProperty().bindBidirectional(passwordField.textProperty());

        CheckBox showPassword = new CheckBox("Show password");
        showPassword.selectedProperty().addListener((obs, oldV, newV) -> {
            visibleField.setManaged(newV);
            visibleField.setVisible(newV);

            passwordField.setManaged(!newV);
            passwordField.setVisible(!newV);
        });

        // Strength row
        strengthBar.setPrefWidth(260);
        strengthBar.setProgress(0);

        HBox strengthRow = new HBox(
                10,
                new Label("Score:"),
                strengthBar,
                strengthLabel
        );
        strengthRow.setAlignment(Pos.CENTER_LEFT);

        verdictLabel.setStyle("-fx-font-size: 13px; -fx-font-weight: bold;");

        // Feedback area
        feedbackArea.setEditable(false);
        feedbackArea.setWrapText(true);
        feedbackArea.setPrefRowCount(7);

        Button checkBtn = new Button("Check");
        checkBtn.setDefaultButton(true);

        Button clearBtn = new Button("Clear");

        HBox buttons = new HBox(10, checkBtn, clearBtn);
        buttons.setAlignment(Pos.CENTER_LEFT);

        // Actions
        Runnable update = () -> evaluate(passwordField.getText());

        checkBtn.setOnAction(e -> update.run());

        // Live update while typing
        passwordField.textProperty().addListener((obs, oldValue, newValue) -> update.run());

        clearBtn.setOnAction(e -> {
            passwordField.clear();

            // UI reset
            strengthBar.setProgress(0);
            strengthLabel.setText("Strength: —");
            verdictLabel.setText("Type a password…");
            feedbackArea.clear();
        });

        // Layout
        VBox root = new VBox(
                12,
                title,
                passwordField,
                visibleField,
                showPassword,
                strengthRow,
                verdictLabel,
                buttons,
                new Label("Feedback:"),
                feedbackArea
        );

        root.setPadding(new Insets(16));
        root.setPrefWidth(460);

        Scene scene = new Scene(root, 500, 420);

        stage.setTitle("Password Strength Checker");
        stage.setScene(scene);
        stage.show();
    }

    private void evaluate(String password) {
        if (password == null) {
            password = "";
        }

        int score = PasswordStrengthCore.calculateStrength(password);
        String verdict = PasswordStrengthCore.evaluate(score);

        strengthBar.setProgress(score / 5.0);
        strengthLabel.setText("Score: " + score + "/5");
        verdictLabel.setText("Password Strength: " + verdict);

        applyStrengthColor(verdict);

        if (PasswordStrengthCore.needsSuggestion(verdict)) {
            feedbackArea.setText(
                    "Suggested Strong Password:\n" +
                    PasswordGenerator.generateStrongPassword()
            );
        } else {
            feedbackArea.setText("✅ No suggestion needed.");
        }
    }

    private void applyStrengthColor(String verdict) {
        switch (verdict) {
            case "WEAK" ->
                    strengthBar.setStyle("-fx-accent: #e74c3c;");

            case "MEDIUM" ->
                    strengthBar.setStyle("-fx-accent: #f39c12;");

            case "STRONG" ->
                    strengthBar.setStyle("-fx-accent: #2ecc71;");

            default ->
                    strengthBar.setStyle("");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

    record StrengthResult(
            int score,
            String verdict,
            java.util.List<String> feedback
    ) {}

    static class PasswordStrength {

        static StrengthResult evaluate(String password) {
            if (password == null) {
                password = "";
            }

            String p = password;

            java.util.ArrayList<String> tips = new java.util.ArrayList<>();
            int score = 0;

            if (p.isBlank()) {
                return new StrengthResult(
                        0,
                        "Type a password…",
                        java.util.List.of("• Start typing to see feedback.")
                );
            }

            // Length
            if (p.length() >= 8) {
                score += 20;
            } else {
                tips.add("• Use at least 8 characters.");
            }

            if (p.length() >= 12) {
                score += 15;
            } else {
                tips.add("• 12+ characters is better.");
            }

            // Character variety
            boolean hasLower = p.matches(".*[a-z].*");
            boolean hasUpper = p.matches(".*[A-Z].*");
            boolean hasDigit = p.matches(".*\\d.*");
            boolean hasSymbol = p.matches(".*[^a-zA-Z0-9].*");

            if (hasLower) {
                score += 12;
            } else {
                tips.add("• Add a lowercase letter.");
            }

            if (hasUpper) {
                score += 12;
            } else {
                tips.add("• Add an uppercase letter.");
            }

            if (hasDigit) {
                score += 12;
            } else {
                tips.add("• Add a number.");
            }

            if (hasSymbol) {
                score += 14;
            } else {
                tips.add("• Add a symbol (e.g. !@#).");
            }

            // Penalties for common patterns
            if (p.matches("(?i)^(password|qwerty|123456|12345678|admin|letmein).*")) {
                score -= 25;
                tips.add("• Avoid common passwords like 'password', '123456', 'qwerty'.");
            }

            if (p.matches(".*(.)\\1\\1.*")) {
                score -= 8;
                tips.add("• Avoid repeating the same character 3+ times.");
            }

            score = Math.max(0, Math.min(100, score));

            String verdict = verdict(score);

            if (tips.isEmpty()) {
                tips.add("✅ Looks strong!");
                tips.add("• Consider using a password manager for unique passwords everywhere.");
            }

            return new StrengthResult(score, verdict, tips);
        }

        private static String verdict(int score) {
            if (score >= 85) {
                return "✅ Strong";
            }

            if (score >= 70) {
                return "🟢 Good";
            }

            if (score >= 50) {
                return "🟡 Medium";
            }

            if (score >= 30) {
                return "🟠 Weak";
            }

            return "🔴 Very weak";
        }
    }
}