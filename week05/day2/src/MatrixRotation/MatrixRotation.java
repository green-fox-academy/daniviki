package MatrixRotation;

import java.util.Arrays;

public class MatrixRotation {

    public static void main(String[] args) {
        // Create a function named `rotateMatrix` that takes an n×n integer matrix (array of arrays) as parameter
        // and returns a matrix which elements are rotated 90 degrees clockwise.
        //
        // example input:
        // [
        // [1, 2, 3]
        // [4, 5, 6]
        // [7, 8, 9]
        // ]
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] rotatedMatrix = rotateMatrix(matrix);

        Arrays.stream(rotatedMatrix).forEach(row -> System.out.println(Arrays.toString(row)));
        // should print
        // [7, 4, 1]
        // [8, 5, 2]
        // [9, 6, 3]
    }

    private static int[][] rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length - i - 1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = temp;
            }
        }
        return matrix;
    }
}