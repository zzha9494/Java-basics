package W2;

import java.util.Scanner;

public class MatrixMult {

    static int[] get_dimensions(Scanner scan) {

        int[] dimensions = new int[4];
        for (int dimension = 0; dimension < 4; dimension++) {
            if (scan.hasNextInt()) {
                dimensions[dimension] = scan.nextInt();
                if (dimensions[dimension] <= 0)
                    return null;
            }
            else
                return null;
        }
        return dimensions;
    }

    static int[][] get_matrix(int row, int column, Scanner scan) {
        if (row == 1 && column == 1)
            return null;

        int[][] matrix = new int[row][column];
        int count = 0;

        for (int i = 0; i < row; i++){
            for (int j=0; j<column; j++) {
                if (scan.hasNextInt()){
                    matrix[i][j] = scan.nextInt();
                    if (matrix[i][j] == 0){
                        count += 1;
                        if (count == 2)
                            return null;
                    }
                }
                else
                    return null;
            }
        }
        return matrix;
    }

    static int[][] calculate_matrix(int[][] A, int[][] B) {
        if (A == null || B == null){
            System.out.println("Invalid input.");
            return null;
        }

        int [][] result = new int[A.length][B[0].length];
        for (int i=0; i<A.length;i++)
            for(int j=0; j<B[0].length; j++){
                int sum = 0;
                for (int x = 0; x < B.length; x++)
                    sum += A[i][x] * B[x][j];
                result[i][j] = sum;
            }
        return result;
    }

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] dimensions = get_dimensions(scan);
        if (dimensions != null) {
            int A_row = dimensions[1];
            int A_column = dimensions[0];
            int B_row = dimensions[3];
            int B_column = dimensions[2];

            int[][] matrix_A;
            matrix_A = get_matrix(A_row, A_column, scan);
            int[][] matrix_B;
            matrix_B = get_matrix(B_row, B_column, scan);

            int[][] result;
            result = calculate_matrix(matrix_A, matrix_B);

            if (result != null) {
                for(int i=0;i<A_row;i++){
                    for (int j=0;j<B_column;j++){
                        System.out.print(result[i][j]);
                        if (j < B_column-1)
                            System.out.print(" ");
                    }
                    System.out.println();
                }
            }
        }
        else
            System.out.println("0");
    }

}
