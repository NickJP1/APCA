package Chapter04;

import java.util.Scanner;

/**
 * Program to find your major
 *
 * @author Nicholas Philip
 */
public class C4_1 {

    /**
     * Main Method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your major and the year of school: ");
        String major = input.next().toUpperCase(); //m1 //M1
        char first = major.charAt(0);
        char second = major.charAt(1);

        String m = "";
        String g = "";
        if (first == 'M') {
            m = "Mathemeatics";
        } else if (first == 'C') {
            m = "computer science";
        } else if (first == 'I') {
            m = "information technology";
        } else {
            System.out.println("Invalid input");
            System.exit(0);
        }

        if (second == '1') {
            g = "Freshman";
        } else if (first == 'C') {
            m = "computer science";
        } else if (first == 'I') {
            m = "information technology";
        } else {
            System.out.println("Invalid input");
            System.exit(0);
        }

        System.out.println(m + " " + g);
    }

}
