package Chapter02;

import java.util.Scanner;

/**
 * Program to calculate the interest rate
 *
 * @author Nicholas Philip
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 0.0;
        double annualInterestRate = 0.0;
        double interest = 0.0;
        System.out.print("Balance is: ");
        balance = input.nextDouble();
        System.out.print("Annual interest rate is: ");
        annualInterestRate = input.nextDouble();
        interest = balance * (annualInterestRate / 1200);
        System.out.println("The interest is: " + interest);
    }

}
