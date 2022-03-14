package W3;

import java.util.Arrays;

public class SudokuSolve {

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


        return false;
    }

    public static void main(String[] args) {
        //Write some tests if you want check here or change b
        Integer[][] b = {
                { 1, 2, 3},
                { 4,6,5},
                { 7,8,9}
        };
        if(isSolvable(b)) {
            System.out.println("Yes this is solvable!");

//        System.out.println(b[0][2]);
        }
        System.out.println(arrayValid(b[1]));
    }

}