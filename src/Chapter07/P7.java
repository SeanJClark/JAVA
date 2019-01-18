package Chapter07;

import java.util.*;

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
        int place_holder = input.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>(place_holder);
        fillArray(numbers, place_holder, input);
        System.out.println("The average is " + average(numbers));
        displayArray(numbers);
    }

    /**
     * Finds the length of the array
     *
     * @param numbers number of charters in the array
     * @param place_holder amount of times the for loop is repeated
     * @param input number of numbers entered by user
     */
    public static void fillArray(ArrayList<Integer> numbers,int place_holder, Scanner input) {
 
        for (int i = 0; i < place_holder; i++) {
            System.out.print("Enter an element: ");
            numbers.add(input.nextInt());
        }
    }

    /**
     * Computes the average
     *
     * @param numbers number of numbers in the array
     * @return average
     */
    public static double average(ArrayList<Integer> numbers) {
        double sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            sum = sum + numbers.get(i);
        }

        return sum / numbers.size();
    }

    /**
     * Displays contents of array
     *
     * @param numbers contents of array
     */
    public static void displayArray(ArrayList<Integer> numbers) {
        System.out.println("The contents of the array: " + (numbers));
    }
}
