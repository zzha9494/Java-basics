package W5;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Scissors {

    public static void main(String[] args) {

        int column = Integer.parseInt(args[0]);
        File f = new File(args[1]);
        Scanner scan = null;

        try {
            scan = new Scanner(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ArrayList<String[]> matrix = new ArrayList<>();

        while(scan.hasNextLine()) {
            String[] row = scan.nextLine().split(" ");
            matrix.add(row);
        }
        for (int i =0; i<matrix.size(); i++)
            System.out.println(matrix.get(i)[column - 1]);
        }



}

