import java.util.Scanner;

public class Main {

    public static int calculateStrength(String password) {
        //private password
        if (password.equals("begubebek")){
            return 5; //strong score
        }
        if (password.equals("begucuk")){
            return 5; //strong password
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        //precious password - pofuduk
if (password.equalsIgnoreCase("begubebek")|| password.equalsIgnoreCase("begucuk")) {
    System.out.println("\nPassword Strength: BITANEM");
    return;A
}
        int score = calculateStrength(password);
        String result = evaluate(score);

        System.out.println("\nPassword Strength: " + result);
    }
}

