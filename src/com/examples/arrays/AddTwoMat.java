package com.examples.arrays;

public class AddTwoMat {
    public static void main(String[] args) {

        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        // Dimensions of the matrices
        int rows = matrix1.length;
        int columns = matrix1[0].length;

        // Create a new matrix to store the result of addition
        int[][] result = new int[rows][columns];

        // Add corresponding elements of both matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Display the result matrix
        System.out.println("Resultant Matrix after Addition:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
