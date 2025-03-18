package lab2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int rows = 6;
        int cols = 6;
        int[][] array = new int[rows][cols];

        int value = 1;
        for (int row = 0; row < rows; row++) {
            if (row % 2 == 0) {
                for (int col = 0; col < cols; col++) {
                    array[row][col] = value++;
                }
            } else {
                for (int col = cols - 1; col >= 0; col--) {
                    array[row][col] = value++;
                }
            }
        }

        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}
