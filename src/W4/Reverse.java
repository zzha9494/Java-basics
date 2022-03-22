package W4;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse {

    public static String reverse_string(String s) {
        StringBuilder temp = new StringBuilder(s);
        temp.reverse();
        return temp.toString();
    }

    public static void main(String[] args) {

        // TODO
        ArrayList<String> a = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String s = scan.nextLine();
            s = reverse_string(s);
            a.add(s);
        }

        for (String i: a)
            System.out.println(i);
    }

}