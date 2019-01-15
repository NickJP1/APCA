package Chapter04;

import java.util.Scanner;

import java.text.DecimalFormat;

/**
 * Program to do a bid
 *
 * @author Nicholas Philip
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        DecimalFormat ft = new DecimalFormat("$###,###.00");

        System.out.print("Enter first bidder's name: ");
        String name1 = input.next();

        System.out.print("Hours of work first bidder will require: ");
        int hours1 = input.nextInt();

        System.out.print("Amount of money first bidder charges: ");
        double price1 = input.nextDouble();

        System.out.print("Enter second bidder's name: ");
        String name2 = input.next();

        System.out.print("Hours of work second bidder will require: ");
        int hours2 = input.nextInt();

        System.out.print("Amount second bidder charges: ");
        double price2 = input.nextDouble();

        double cost1 = 0.00;
        double cost2 = 0.00;

        cost1 = price1 * hours1;
        System.out.printf("Cost of bidder 1 is: $%.2f ", cost1);

        cost2 = price2 * hours2;
        System.out.printf("\nCost of bidder 2 is: $%.2f ", cost2);

        if (cost1 < cost2) {
            System.out.printf("Winner is, %s and the cost is: $&.2f ", name1, cost1);

        } else if (cost2 < cost1) {
            System.out.printf("Winner is, %s and the cost is: $&.2f ", name2, cost2);
        }
        if (cost1 == cost2 && hours1 < hours2) {
            System.out.printf("Winner is %s the cost is: $&.2f and the hours worked are: %d ", name1, cost1, hours1);

        } else if (cost1 == cost2 && hours2 < hours1) {
            System.out.printf("Winner is  %s  the cost is: $%.2f and the hours worked are: %d ", name2, cost2, hours2);
        }
        if (cost1 == cost2 && hours1 == hours2) {
            System.out.printf("\n%s and %s have identical bids, $%d is the amount of "
                    + "hours, $%.2f is the price per hour, $%.2f is the total cost, %d is the "
                    + "time to finish the job. ", name1, name2, hours2, price2, cost2, hours2);
        }
    }
}
