package Chapter04;

import java.util.Scanner;

/**
 * Program ti find if it's a string or not
 *
 * @author Nicholas Philip
 */
public class C4_2 {

    /**
     * Main Method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String s1: ");
        String s1 = input.next();
        System.out.print("Enter String s2: ");
        String s2 = input.next();
        if (s1.indexOf(s2) != -1) {
            System.out.printf("%s is a substring of %s%n", s2, s1);
        } else {
            System.out.printf("%s is a not a substring of %s%n", s2, s1);
        }
    }

}
