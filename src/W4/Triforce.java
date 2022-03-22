package W4;

import java.util.ArrayList;
import java.util.Scanner;

public class Triforce {

    public static void main(String[] args) {

        // TODO
        System.out.print("Enter height: ");
        Scanner scan = new Scanner(System.in);
        if (!scan.hasNextInt()) {
            System.out.println("\nInvalid height.");
            return;
        }

        int h = scan.nextInt();
        if (h < 2 || h > 20) {
            System.out.println("\nInvalid height.");
            return;
        }

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

        StringBuilder blank = new StringBuilder();
        for (int i=0; i<h; i++)
            blank.append(' ');

        for (int i=0;i<h; i++) {
            blank.append(onetriangle.get(i));
            String temp = blank.toString();
            onetriangle.add(new StringBuilder(temp));
            blank.delete(h, blank.length());
            onetriangle.get(i).append(onetriangle.get(i));
        }

        for (int i=1; i<h;i++) {
            StringBuilder temp = onetriangle.get(i);
            temp.delete(temp.length()-i, temp.length());

            temp = onetriangle.get(h + i);
            temp.delete(temp.length()-i, temp.length());
        }

        System.out.println("");
        for (int i =0; i < onetriangle.size(); i++)
            System.out.println(onetriangle.get(onetriangle.size()-i-1));
    }

}