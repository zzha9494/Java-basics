package W3;

import java.util.Arrays;

public class SudokuSolve2 {
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

        Integer [] c1= {board[0][0], board[1][0], board[2][0]};
        Integer [] c2= {board[0][1], board[1][1], board[2][1]};
        Integer [] c3= {board[0][2], board[1][2], board[2][2]};
        Integer [] all = {board[0][0], board[1][0], board[2][0], board[0][1], board[1][1], board[2][1], board[0][2], board[1][2], board[2][2]};
        if (!isArrayValid(c1) || !isArrayValid(c2) || !isArrayValid(c3) || !isArrayValid(all)) {
            System.out.println(7);
            return false;
        }


//        Integer[] column = new Integer[board.length];
//        for (int i =0;i<board.length;i++) {
//
//        }

        return true;
    }

    public static void main(String[] args) {
        //Write some tests if you want check here or change b
        Integer[][] b = {
                { 1, 2, 3},
                { 4,5,null},
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