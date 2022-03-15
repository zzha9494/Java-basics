package W3;

import java.util.Arrays;

public class SudokuSolve {
    public static boolean isArrayValid(Integer[] x) {
        int[] a = new int[x.length];
        for(int i=0; i<x.length;i++)
            a[i] = x[i];

        Arrays.sort(a);
        for (int i = 1; i < a.length; i++) {
            if (a[i-1] == a[i])
                return false;
        }
        return true;
    }

    public static boolean isSolvable(Integer[][] board) {
        //TODO

        if (board == null) {
//            System.out.println(1);
            return false;
        }

        if (board.length % 3 != 0) {
//            System.out.println(2);
            return false;
        }

        for (Integer[] i: board) {
            if (i == null) {
//                System.out.println(3);
                return false;
            }

            if (i.length % 3 != 0) {
//                System.out.println(4);
                return false;
            }

            for (Integer j: i) {
                if (j == null) {
//                    System.out.println(5);
                    return false;
                }
            }
        }

        for (Integer[] i: board) {
            if (!isArrayValid(i)) {
                System.out.println(6);
                return false; // row
            }
        }


        Integer[] column = new Integer[board.length];
        for (int i =0;i<board.length;i++) {

        }

        return true;
    }

    public static void main(String[] args) {
        //Write some tests if you want check here or change b
        Integer[][] b = {
                { 1, 2, 3},
                { 4,5,6},
                {11,12,13}
        };
//        if (isArrayValid(b[1])) {
//            System.out.println("yes");
//        }
//    }


        if(isSolvable(b)) {
            System.out.println("Yes this is solvable!");
        }
    }

}