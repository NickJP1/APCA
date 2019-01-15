package Chapter04;

import java.util.Scanner;

/**
 * Program to show employee's pay statistics
 *
 * @author Nicholas Philip
 */
public class C4_3 {

    /**
     * Main Method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String name = input.next();
        System.out.print("Enter number of hours worked in a week: ");
        double hoursWorked = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double PayRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double fedTaxRate = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTaxRate = input.nextDouble();
        double grossPay = PayRate * hoursWorked;
        double federalWitholding = grossPay * fedTaxRate;
        double stateWitholding = grossPay * stateTaxRate;
        double totalDeduction = federalWitholding + stateWitholding;
        double netPay = grossPay - totalDeduction;
        System.out.printf("Employee name: %s "
                + "\nHours Worked: %.1f"
                + "\nPay Rate: $%.2f"
                + "\nGross Pay: $%.1f"
                + "\nDeductions:"
                + "\n  Federal Withholdings (%.1f%%): $%.1f"
                + "\n  State Withholdings (%.1f%%): $%.2f"
                + "\n  Total Deduction: $%.2f"
                + "\nnet Pay: $%.2f",
                name, hoursWorked, PayRate,
                grossPay, fedTaxRate * 100,
                federalWitholding, stateTaxRate * 100,
                stateWitholding, totalDeduction,
                netPay);
    }
}
