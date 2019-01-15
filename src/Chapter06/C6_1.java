package Chapter06;

import java.util.Scanner;

/**
 * Program to compute password
 *
 * @author Nicholas Philip
 */
public class C6_1 {

    /**
     * Main Method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = input.next();

        System.out.println(isValid(password) ? "Valid Password" : "Invalid Password");
    }

    /**
     * Is Valid Method
     *
     * @param password Length of PAssword
     * @return If Password is valid or not
     */
    public static boolean isValid(String password) {

        if (password.length() < 8) {
            System.out.println("A password must have at least eight characters");
            return false;
        }

        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                System.out.println("A password must consist of only letters and digits");
                return false;
            }
        }

        int digits = 0;
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isDigit(password.charAt(i))) {
                ++digits;
            }
        }
        if (digits < 2) {
            System.out.println("A password must contain at least two digits");
            return false;
        }

        return true;
    }
}
