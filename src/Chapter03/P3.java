package Chapter03;

import java.util.Scanner;

/**
 * Program to calculate the grade of two numbers
 *
 * @author Nicholas Philip
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double firstNumber = 0.0;
        double secondNumber = 0.0;

        System.out.print("First number is: ");
        firstNumber = input.nextDouble();

        System.out.print("Second number is: ");
        secondNumber = input.nextDouble();

        if (firstNumber < secondNumber) {
            System.out.println("the first number is less than than the second.");

        }
        if (firstNumber > secondNumber) {
            System.out.println("the first number is greater than the second.");

        }
        if (firstNumber == secondNumber) {
            System.out.println("the first number is equal to the second.");

        }
        if (firstNumber <= secondNumber) {
            System.out.println("The first number is less than or equal to the second.");

        }
        if (firstNumber != secondNumber) {
            System.out.println("The first number is not equal to the second.");

        }
        if (secondNumber == 0) {
            System.out.println("Cannot divide by zero.");
        }
        if (firstNumber / secondNumber < 1) {
            System.out.println("proper fraction");

        } else {
            System.out.println("improper fraction");
        }
        if (firstNumber >= 90) {
            System.out.println("A");

        } else if (firstNumber >= 80) {
            System.out.println("B");

        } else if (firstNumber >= 70) {
            System.out.println("C");

        } else if (firstNumber >= 60) {
            System.out.println("D");

        } else {
            System.out.println("F");

        }
        if (secondNumber >= 1 && secondNumber <= 100) {
            System.out.println("In range");

        } else {
            System.out.println("Out of range");

        }
    }
}
