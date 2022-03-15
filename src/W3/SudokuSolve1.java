package W3;

import java.util.Arrays;

public class SudokuSolve1 {

    public static boolean arrayValid(Integer [] a) {
        if (a == null) {
            return false;
        }
        else {
            int[] temp = new int[a.length];
            for (int i=0; i<a.length; i++) {
                if (a[i] == null)
                    return false;
                temp[i] = a[i];
            }
            Arrays.sort(temp);
            for (int i = 1; i < temp.length; i++) {
                if (temp[i-1] == temp[i])
                    return false;
            }
            return true;
        }
    }

    public static boolean isSolvable(Integer[][] board) {
        //TODO
        if (board == null)
            return false;

        if(board.length %3 !=0)
            return false;

        for (Integer[] i: board) {
            if (i == null)
                return false;
            if (i.length %3 != 0)
                return false;
        }



        Integer[][] checklist = new Integer[7][];
        checklist[0] = board[0];
        checklist[1] = board[1];
        checklist[2] = board[2];
        for (int i = 3; i < 6; i++) {
            checklist[i] = new Integer[]{board[0][i - 3], board[1][i - 3], board[2][i - 3]};
        }
        checklist[6] = new Integer[9];
        int count = 0;
        for (int i=0;i<3;i++) {
            for(Integer j: checklist[i]) {
                checklist[6][count++] = j;
            }
        }

        for (Integer[] i: checklist)
            if (!arrayValid(i))
                return false;
        return true;
    }

    public static void main(String[] args) {
        //Write some tests if you want check here or change b
        Integer[][] b = {
                {1,2,3},
                {4,5,6},
                {7,8,9, null}



        };
        if(isSolvable(b))
            System.out.println("Yes this is solvable!");
        else
            System.out.println("no");

    }

}