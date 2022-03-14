package W3;

import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        int[] a = new int[10];
        int index = 0;

        if (args.length == 2) {
            File f = new File(args[0]);
            try {
                Scanner scan = new Scanner(f);
                while (scan.hasNext())
                    a[index++] = Integer.parseInt(scan.next());
            } catch (FileNotFoundException e) {
                System.out.println("error");
            }

        }
        else
            return;

        int[] b = new int[index];
        for (int i = 0; i < index; i++) {
            b[i] = a[index - 1 - i];
        }

        File f2 = new File(args[1]);
        try {
            PrintWriter writer = new PrintWriter(f2);
            for (int i = 0; i < b.length;i++) {
                if (i < b.length -1 )
                    writer.print(b[i] + " ");
                else
                    writer.println(b[i]);
            }
            writer.close();
        } catch (FileNotFoundException e) {
            return;
        }
        System.out.println();

    }

}