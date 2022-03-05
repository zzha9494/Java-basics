package W2;

public class ArrayMerge{

    public static int[][] mergeArrays(int[][] arrayA, int[][] arrayB){
        int columnA = arrayA[0].length;
        int columnB = arrayB[0].length;

        int[][] mergeArrays = new int[arrayA.length][columnA + columnB];

        for (int i =0;i < arrayA.length; i++) {
            for (int j=0; j<arrayA[i].length; j++)
                mergeArrays[i][j] = arrayA[i][j];
            for (int j=0; j<columnB; j++)
                mergeArrays[i][columnA + j] = arrayB[i][j];

        }
        return mergeArrays;
    }

    public static void main(String[] args) {
        int[][] matrix1 = new int[2][];
        matrix1[0] = new int[] { 1, 2, 3, 4 };
        matrix1[1] = new int[] { 5, 6,7,8};

        int[][] matrix2 = new int[2][];
        matrix2[0] = new int[] { 1, 2, 3, 4 };
        matrix2[1] = new int[] { 5, 6,7,8};

        int[][] merge = mergeArrays(matrix1, matrix2);

    }

}