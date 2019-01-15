package Chapter02;

import java.util.Scanner;

/**
 * Compute Cost of a meal
 *
 * @author Sean
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        double mealPrice;
        double drinkPrice;
        double dessertPrice;
        double foodPrice;
        double tipAmount;
        double taxAmount;
        double totalPrice;

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

        System.out.println("Food price: " + "$" + foodPrice);
        System.out.println("Tax amount: " + "$" + taxAmount);
        System.out.println("Tip amount: " + "$" + tipAmount);
        System.out.println("Total cost: " + "$" + totalPrice);

    }
}
