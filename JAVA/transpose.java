package JAVA;

public class transpose {
    public static void main(String args[]) {
        int row = 2, column = 3;
        int[][] matrix = { { 2, 3, 4 }, { 5, 6, 4 } };
        // display current matrix
        display(matrix);
        // Transpose the matrix
        int[][] transpose = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        // Display transposed matrix
        System.out.println("after Transpose,");
        display(transpose);
    }

    private static void display(int[][] matrix) {
        {
            System.out.println("The matrix is :");
            for (int[] row : matrix) {
                for (int column : row) {
                    System.out.println(row);
                    System.out.println(column);
                }
            }
        }
    }
}