package Chapter07;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Program to compute the average of an array
 *
 * @author Nicholas Philip
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers will be read: ");
        int[] numbers = new int[input.nextInt()];

        fillArray(numbers, input);
        System.out.println("The average is " + average(numbers));
        displayArray(numbers);
    }

    /**
     * Fins the length of the array
     *
     * @param numbers number of charters in the array
     * @param input number of numbers entered by user
     */
    public static void fillArray(int[] numbers, Scanner input) {
        System.out.print("Enter " + numbers.length + " elements: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
    }

    /**
     * Computes the average
     *
     * @param numbers number of numbers in the array
     * @return average
     */
    public static double average(int[] numbers) {
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        return sum / numbers.length;
    }

    /**
     * Displays contents of array
     *
     * @param numbers contents of array
     */
    public static void displayArray(int[] numbers) {
        System.out.println("The contents of the array: " + Arrays.toString(numbers));
    }
}
