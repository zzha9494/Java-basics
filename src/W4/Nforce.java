package W4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nforce {

    public static List<StringBuilder> create_one_triangle(int h) {
        StringBuilder line = new StringBuilder();
        StringBuilder outside = new StringBuilder();
        StringBuilder inside = new StringBuilder();
        ArrayList<StringBuilder> onetriangle = new ArrayList<StringBuilder>();
        for (int i = 1; i <= h; i++) {
            for (int times = 0; times < i-1; times++)
                outside.append(' ');

            for (int times = 0; times < h - i; times++) {
                if (i == 1)

                    inside.append('_');
                else
                    inside.append(' ');
            }

            line.append(outside).append('/').append(inside).append(inside).append('\\').append(outside);
            onetriangle.add(line);
            line = new StringBuilder();
            outside.delete(0, outside.length());
            inside = new StringBuilder();
        }
        return onetriangle;
    }

    public static void main(String[] args) {

        // TODO
        System.out.print("Enter height: ");
        Scanner scan = new Scanner(System.in);
        if (!scan.hasNextInt()) {
            System.out.println("\nInvalid height.");
            return;
        }
        int h = scan.nextInt();
        if (h < 1 || h > 20) {
            System.out.println("\nInvalid height.");
            return;
        }

        System.out.print("Enter number of rows: ");
        if (!scan.hasNextInt()) {
            System.out.println("\nInvalid number of rows.");
            return;
        }
        int row = scan.nextInt();

        List<StringBuilder> output = new ArrayList<StringBuilder>();

        List<String> triangle = new ArrayList<String>();
        for (StringBuilder i: create_one_triangle(h))
            triangle.add(i.toString());

        StringBuilder blank = new StringBuilder();
        for (int i = 0; i < h * row; i++) {
            output.add(new StringBuilder(blank.toString()));
            blank.append(' ');
        }

        List<StringBuilder> temp = create_one_triangle(h);
        for (int i=1; i<h; i++)
            temp.get(i).delete(0, i);
        for (int j = 0; j<h*row; j++) {
            output.get(j).append(temp.get(j%h));
        }

        for (int i = 0; i< row; i++)
            for (int j = 0; j<h*row; j++)
                if (j < i*h)
                    output.get(j).append(triangle.get(j%h));

        for (int i = 0; i<h*row; i++) {
            StringBuilder line = output.get(i);
            line.delete(line.length()-i%h, line.length());
        }








        for (int i =0; i < output.size(); i++)
            System.out.println(output.get(output.size()-i-1));
    }

}