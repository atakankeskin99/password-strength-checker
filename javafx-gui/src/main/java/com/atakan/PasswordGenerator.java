package com.atakan;

import java.security.SecureRandom;

public class PasswordGenerator {

    public static String generateStrongPassword() {
        final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String lower = "abcdefghijklmnopqrstuvwxyz";
        final String digits = "0123456789";
        final String symbols = "!@#$%^&*().,?";

        final String all = upper + lower + digits + symbols;

        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();

        sb.append(upper.charAt(random.nextInt(upper.length())));
        sb.append(lower.charAt(random.nextInt(lower.length())));
        sb.append(digits.charAt(random.nextInt(digits.length())));
        sb.append(symbols.charAt(random.nextInt(symbols.length())));

        int totalLength = 12;
        while (sb.length() < totalLength) {
            sb.append(all.charAt(random.nextInt(all.length())));
        }

        char[] arr = sb.toString().toCharArray();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }

        return new String(arr);
    }
}
