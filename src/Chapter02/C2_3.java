package Chapter02;

import java.util.Scanner;

/**
 * Program to find the cost of driving a distance
 *
 * @author Nicholas Philip
 */
public class C2_3 {

    /**
     * Main Method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double drivingDistance = 0.0;
        double milesPerGallon = 0.0;
        double pricePerGallon = 0.0;
        double costOfDriving = 0.0;
        System.out.print("Insert the driving distance: ");
        drivingDistance = input.nextDouble();
        System.out.print("Insert miles per gallon: ");
        milesPerGallon = input.nextDouble();
        System.out.print("Insert price per gallon: ");
        pricePerGallon = input.nextDouble();
        costOfDriving = (drivingDistance / milesPerGallon) * pricePerGallon;
        System.out.println("The cost of driving is: " + "$" + costOfDriving);
    }

}
