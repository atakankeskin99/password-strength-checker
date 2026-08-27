package test;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {

    public static int calculateStrength(String password) {
        // private password
        if (password.equals("begubebek")) return 5;
        if (password.equals("begucuk")) return 5;

        int score = 0;

        if (password.length() >= 9) score++;
        if (password.matches(".*[A-Z].*")) score++;
        if (password.matches(".*[a-z].*")) score++;
        if (password.matches(".*[0-9].*")) score++;
        if (password.matches(".*[!@#$%^&*().,?].*")) score++;

        return score;
    }

    public static String evaluate(int score) {
        if (score <= 2) return "WEAK";
        if (score <= 4) return "MEDIUM";
        return "STRONG";
    }

    // ✅ New: determines if we should suggest a stronger password
    public static boolean needsSuggestion(String strengthResult) {
        return !"STRONG".equals(strengthResult);
    }

    // ✅ New: show user what is missing (English feedback)
    public static String getMissingCriteria(String password) {
        StringBuilder feedback = new StringBuilder();

        if (!password.matches(".*[A-Z].*")) {
            feedback.append("- At least one uppercase letter (A-Z)\n");
        }
        if (!password.matches(".*[a-z].*")) {
            feedback.append("- At least one lowercase letter (a-z)\n");
        }
        if (!password.matches(".*[0-9].*")) {
            feedback.append("- At least one digit (0-9)\n");
        }
        if (!password.matches(".*[!@#$%^&*().,?].*")) {
            feedback.append("- At least one special character (!@#$...)\n");
        }
        if (password.length() < 9) {
            feedback.append("- Minimum length of 9 characters\n");
        }

        return feedback.toString();
    }

    // ✅ New: guaranteed strong password generator (no flaky tests)
    public static String generateStrongPassword() {
        final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String lower = "abcdefghijklmnopqrstuvwxyz";
        final String digits = "0123456789";
        final String symbols = "!@#$%^&*().,?";

        final String all = upper + lower + digits + symbols;

        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();

        // Guarantee at least one from each category
        sb.append(upper.charAt(random.nextInt(upper.length())));
        sb.append(lower.charAt(random.nextInt(lower.length())));
        sb.append(digits.charAt(random.nextInt(digits.length())));
        sb.append(symbols.charAt(random.nextInt(symbols.length())));

        // Fill the rest
        int totalLength = 12; // you can change this
        while (sb.length() < totalLength) {
            sb.append(all.charAt(random.nextInt(all.length())));
        }

        // Shuffle so first 4 chars aren't predictable
        char[] arr = sb.toString().toCharArray();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // precious password - pofuduk
        if (password.equalsIgnoreCase("begubebek") || password.equalsIgnoreCase("begucuk")) {
            System.out.println("\nPassword Strength: BITANEM");
            return;
        }

        int score = calculateStrength(password);
        String result = evaluate(score);

        System.out.println("\nPassword Strength: " + result);

        if (!"STRONG".equals(result)) {
            System.out.println("Missing requirements:");
            System.out.print(getMissingCriteria(password));
        }

        if (needsSuggestion(result)) {
            System.out.println("Suggested Strong Password: " + generateStrongPassword());
        }
    }
}
