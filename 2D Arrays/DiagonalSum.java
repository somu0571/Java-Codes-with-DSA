import java.util.*;

// Problem: Calculate Diagonal Sum
public class DiagonalSum {
    public static int calcSum(int matrix[][]) {
        int sum = 0;
        int n = matrix.length;

        // primary diagonal
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
        }

        // secondary diagonal
        for (int i = 0; i < n; i++) {
            int j = n - 1 - i;
            if (i != j) { // avoid double-counting center element in odd-sized matrix
                sum += matrix[i][j];
            }
        }

        return sum;
    }

    public static void main(String args[]) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        System.out.println("Diagonal Sum = " + calcSum(matrix));
    }
}
