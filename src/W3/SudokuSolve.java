package W3;

import java.util.Arrays;

public class SudokuSolve {
    public static boolean isArrayValid(Integer[] x) {

        int[] a = new int[x.length];
        for(int i=0; i<x.length;i++) {
            if (x[i] != null) {
                a[i] = x[i];
            }

        }


        Arrays.sort(a);
        for (int i = 1; i < a.length; i++) {
            if (a[i-1] == a[i])
                return false;
        }
        return true;
    }

    public static boolean isSolvable(Integer[][] board) {
        //TODO

        if (board == null)
            return false;

        if (board.length % 3 != 0)
            return false;

        for (int i=0;i<board.length;i++) {
            if (board[i] == null)
                return false;

            if (board[i].length % 3 != 0)
                return false;

            for (int j=0;j<board[i].length;j++) {
                if (board[1][2] == null) {
                    return true; //?
                }
            }

        }

        for (int i = 0; i<3;i++) {
            if (!isArrayValid(board[0])) {
                return false;
            }
            if (!isArrayValid(board[1])) {
                return false;
            }
            if (!isArrayValid(board[2])) {
                return false; // row ??
            }
        }

        Integer [] c1= {board[0][0], board[1][0], board[2][0]};
        Integer [] c2= {board[0][1], board[1][1], board[2][1]};
        Integer [] c3= {board[0][2], board[1][2], board[2][2]};
        Integer [] all = {board[0][0], board[1][0], board[2][0], board[0][1], board[1][1], board[2][1], board[0][2], board[1][2], board[2][2]};
        if (!isArrayValid(c1) || !isArrayValid(c2) || !isArrayValid(c3)) {
            System.out.println(7);
            return false;
        }
        if (!isArrayValid(all)) {
            System.out.println(7);
            return false;
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