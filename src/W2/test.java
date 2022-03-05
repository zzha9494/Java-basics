package W2;

public class test {

    public static void main(String[] args) {
        int[][] matrix = new int[2][];
        matrix[0] = new int[] { 1, 2, 3, 4 };
        matrix[1] = new int[] { 5, 6,7,8};
//        matrix[2] = new int[] { 9,10,11,12};


        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(matrix.length);
    }
}
