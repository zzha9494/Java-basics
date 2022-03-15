package W3;

import java.util.Arrays;

public class SudokuSolve {
    public static boolean isArrayValid(Integer[] x) {
        int size = 0;
        for (Integer i: x)
            if(i != null)
                size++;

        int[] a = new int[size];
        int index = 0;
        for (Integer i : x)
            if (i != null)
                a[index++] = i;

        Arrays.sort(a);
        for (int i = 1; i < size; i++) {
            if (a[i-1] == a[i])
                return false;
        }
        return true;
    }

    public static boolean isSolvable(Integer[][] board) {
        //TODO
        if (board.length != 3)
            return false;

        Integer[][] checklist = new Integer[7][];
        checklist[0] = board[0];
        checklist[1] = board[1];
        checklist[2] = board[2];
        for (int i = 3; i < 6; i++)
            checklist[i] = new Integer[]{board[0][i - 3], board[1][i - 3], board[2][i - 3]};
        checklist[6] = new Integer[9];
        int count = 0;
        for (int i=0;i<3;i++)
            for(Integer j: checklist[i])
                checklist[6][count++] = j;

        for (Integer[] i: checklist)
            if (!isArrayValid(i))
                return false;

        return true;
    }

    public static void main(String[] args) {
        //Write some tests if you want check here or change b
        Integer[][] b = {
                { 1, 2, 3},
                { 4, 5, 6},
                {7, 8, null}
        };

        isArrayValid(b[1]);
        if(isSolvable(b)) {
            System.out.println("Yes this is solvable!");
        }
    }

}