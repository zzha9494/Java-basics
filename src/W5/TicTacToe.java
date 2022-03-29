package W5;

import java.util.Scanner;

public class TicTacToe {
    public static void print_board(String[][] m) {

        System.out.println("\n"+ m[0][0] + "|" +m[0][1] +"|" + m[0][2]);
        System.out.println("-----");
        System.out.println(m[1][0] + "|" +m[1][1] +"|" + m[1][2]);
        System.out.println("-----");
        System.out.println(m[2][0] + "|" +m[2][1] +"|" + m[2][2]+ "\n");
    }

    public static boolean check_win(String[][] m, String mark) {
        boolean win = false;
        if (m[0][0].equals(mark) && m[0][1].equals(mark) && m[0][2].equals(mark))
            return win = true;
        if (m[1][0].equals(mark) && m[1][1].equals(mark) && m[1][2].equals(mark))
            return win = true;
        if (m[2][0].equals(mark) && m[2][1].equals(mark) && m[2][2].equals(mark))
            return win = true;
        if (m[0][0].equals(mark) && m[1][0].equals(mark) && m[2][0].equals(mark))
            return win = true;
        if (m[0][1].equals(mark) && m[1][1].equals(mark) && m[2][1].equals(mark))
            return win = true;
        if (m[0][2].equals(mark) && m[1][2].equals(mark) && m[2][2].equals(mark))
            return win = true;
        if (m[0][0].equals(mark) && m[1][1].equals(mark) && m[2][2].equals(mark))
            return win = true;
        if (m[0][2].equals(mark) && m[1][1].equals(mark) && m[2][0].equals(mark))
            return win = true;
        return win;
    }

    public static void main(String[] args) {
        int input_count = 0;
        String mark;
        String[][] m = {
                {" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "}
        };
        int column;
        int row;

        Scanner scan= new Scanner(System.in);
        while(scan.hasNextLine()) {
            input_count++;
            if (input_count % 2 == 1)
                mark = "X";
            else
                mark = "O";

            column = scan.nextInt();
            row = scan.nextInt();
            m[row][column] = mark;

            if (check_win(m, mark))
                System.out.println(mark+ " wins!");
            else {
                if (input_count == 9)
                    System.out.println("Draw");
            }
            print_board(m);
            if (check_win(m, mark) || input_count == 9)
                return;
        }

    }

}
