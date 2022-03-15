package W3;

public class SudokuSolve {

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






        return true;
    }

    public static void main(String[] args) {
        //Write some tests if you want check here or change b
        Integer[][] b = {
                { 1, 2, 3},
                { 4,5,6},
                {1,1,9,1,1,1}
        };

        if(isSolvable(b)) {
            System.out.println("Yes this is solvable!");
        }
    }

}