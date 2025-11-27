import java.util.Scanner;
import java.security.SecureRandom;

public class Main {

    private static final String UPPER   = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER   = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS  = "0123456789";
    private static final String SPECIAL = "!@#$%^&*().,?";
    private static final String ALL_CHARS = UPPER + LOWER + DIGITS + SPECIAL;

    private static final SecureRandom RANDOM = new SecureRandom();

    public static int calculateStrength(String password) {

        // private password
        if (password.equals("begubebek")) {
            return 5; // strong score
        }
        if (password.equals("begucuk")) {
            return 5; // strong password
        }

        int score = 0;

        if (password.length() >= 9) score++;
        if (password.matches(".*[A-Z].*")) score++;
        if (password.matches(".*[a-z].*")) score++;
        if (password.matches(".*[0-9].*")) score++;
        if (password.matches(".*[!@#$%^&*().,?].*")) score++;

        return score;
    }

    public static String evaluate(int score) {
        if (score <= 2) {
            return "WEAK";
        } else if (score <= 4) {
            return "MEDIUM";
        } else {
            return "STRONG";
        }
    }

    // password generator
    public static String generatePassword(int length) {
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = RANDOM.nextInt(ALL_CHARS.length());
            password.append(ALL_CHARS.charAt(index));
        }

        return password.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // precious password - pofuduk
        if (password.equalsIgnoreCase("begubebek")) {
            System.out.println("\nPassword Strength: BITANEM");
            return;
        }
        if (password.equalsIgnoreCase("begucuk")) {
            System.out.println("\nPassword Strength: POFUDUK\uD83D\uDC96");
        }
if (password.equalsIgnoreCase("elmasekeri")) {
    System.out.println("\nPassword Strength: LOKUM \uD83C\uDF6D");
}
        int score = calculateStrength(password);
        String result = evaluate(score);

        System.out.println("\nPassword Strength: " + result);

        // suggest password if not strong
        if (!result.equals("STRONG")) {
            System.out.print("\nSuggested strong password (length 12): ");
            String suggested = generatePassword(12);
            System.out.println(suggested);
        }
    }
}
