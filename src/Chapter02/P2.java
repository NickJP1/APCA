package Chapter02;

import java.util.Scanner;

/**
 * Program to calculate meal price
 *
 * @author Nicholas Philip
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        double mealPrice = 0.0;
        double drinkPrice = 0.0;
        double dessertPrice = 0.0;
        double foodPrice = 0.0;
        double tipAmount = 0.0;
        double taxAmount = 0.0;
        double totalPrice = 0.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of the meal: ");
        mealPrice = input.nextDouble();

        System.out.print("Enter the price of the drink: ");
        drinkPrice = input.nextDouble();

        System.out.print("Enter the price of dessert: ");
        dessertPrice = input.nextDouble();

        foodPrice = mealPrice + drinkPrice + dessertPrice;

        taxAmount = foodPrice * 0.10;

        tipAmount = (foodPrice + taxAmount) * 0.15;

        totalPrice = foodPrice + taxAmount + tipAmount;

        System.out.println("Food price: $" + foodPrice);
        System.out.println("Tax amount: " + taxAmount);
        System.out.println("Tip amount: " + "$" + tipAmount);
        System.out.println("Total cost: " + "$" + totalPrice);

    }
}
