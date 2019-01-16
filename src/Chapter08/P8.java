package Chapter08;

import java.util.Scanner;

/**
 * Computing Matrices
 *
 * @author Sean Clark
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] x = new double[3][4];

        System.out.println("Enter a 3-by-4 matrix row by row: ");
        for (int row = 0; row < x.length; row++) {
            for (int column = 0; column < x[row].length; column++) {
                x[row][column] = input.nextDouble();
            }
        }

        for (int column = 0; column < 4; column++) {
            System.out.println("Sum of the elements at column " + column + " is " + sumColumn(x, column));
        }
    }

    /**
     * Compute the sum of the matrices
     *
     * @param m the matrix
     * @param columnIndex column length
     * @return Sum of the matrices
     */
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0.0;
        for (int row = 0; row < m.length; row++) {
            sum = sum + m[row][columnIndex];
        }
        return sum;
    }
}
