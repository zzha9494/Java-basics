package W2;

import java.util.Scanner;

public class MatrixMult {

    static int[] get_dimensions() {
        Scanner x = new Scanner(System.in);

        int[] dimensions = new int[4];
        for (int dimension = 0; dimension < 4; dimension++) {
            if (x.hasNextInt()) {
                dimensions[dimension] = x.nextInt();
                if (dimensions[dimension] <= 0) {
                    System.out.println("Invalid input.");
                    break;
                }
            }
            else{
                System.out.println("Invalid input.");
                break;
            }
        }
        return dimensions;
    }

    static int[][] get_matrix(int row, int column) {
        if (row == 1 && column == 1)
            return null;

        int matrix[][] = new int[row][column];

        for (int i = 0; i < row; i++){
            Scanner scan = new Scanner(System.in);
            for (int j=0; j<column; j++) {
                if (scan.hasNextInt())
                    matrix[i][j] = scan.nextInt();
                else return null;
            }
        }
        return matrix;
    }

    static int[][] calculate_matrix(int[][] A, int[][] B) {
        if (A == null || B == null)
            return null;

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
        int[] dimensions = get_dimensions();
        int A_row = dimensions[1];
        int A_column = dimensions[0];
        int B_row = dimensions[3];
        int B_column = dimensions[2];

        int[][] matrix_A = new int[A_row][A_column];
        matrix_A = get_matrix(A_row, A_column);
        int[][] matrix_B = new int[B_row][B_column];
        matrix_B = get_matrix(B_row, B_column);

        int[][] result = new int[A_row][B_column];
        result = calculate_matrix(matrix_A, matrix_B);



////        int[] a = get_dimensions();
//        int[][] a = new int[2][2];
//        a = get_matrix(2,2);
        System.out.println("");
    }
}
