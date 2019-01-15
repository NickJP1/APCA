package Chapter02;

import java.util.Scanner;

/**
 * Program to find the average acceleration
 *
 * @author Nicholas Philip
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double v1 = 0.0;
        double v0 = 0.0;
        double t = 0.0;
        double a = 0.0;
        System.out.print("Starting velocity v0: ");
        v0 = input.nextDouble();
        System.out.print("Ending velocity v1: ");
        v1 = input.nextDouble();
        System.out.print("Time in Seconds t: ");
        t = input.nextDouble();
        a = (v1 - v0) / t;
        System.out.println("Average acceleration: " + a + " meters/seconds");
    }

}
