package Chapter03;

import java.util.Scanner;

/**
 * Program to find if number is a palindrome
 *
 * @author Nicholas Philip
 */
public class C3_2 {

    /**
     * Main Method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit integer:");
        int number = input.nextInt();
        int first = number / 100;
        int last = number % 10;
        if (last == first) {
            System.out.print(number + " is a palindrome");
        } else {
            System.out.print(number + " is not a palindrome");
        }
    }

}
