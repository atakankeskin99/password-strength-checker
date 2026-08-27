package com.atakan;

import java.util.ArrayList;
import java.util.List;

public class PasswordStrengthCore {

    public static int calculateStrength(String password) {
        // private password (easter egg)
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

    public static boolean needsSuggestion(String strengthResult) {
        return !"STRONG".equals(strengthResult);
    }
}
