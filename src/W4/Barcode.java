package W4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Barcode {

    public static void main(String[] args) {

        // TODO
        List<Integer> a = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        String code = scan.nextLine();

        if (code.length() != 12) {
            System.out.println("invalid");
            return;
        }

        for (int i=0; i<code.length(); i++) {
            int temp = code.charAt(i) - '0';
            a.add(temp);
        }

        int[] odd = {1,3,5,7,9,11};
        int[] even = {2,4,6,8,10};
        int sum = 0;
        for (int i: odd)
            sum += a.get(i-1);
            sum *= 3;
        for (int i: even)
            sum += a.get(i-1);
        int check = 10 - sum%10;

        if (check == 10 && a.get(11)==0) {
            System.out.println("valid");
            return;
        }

        if (check == a.get(11))
            System.out.println("valid");
        else
            System.out.println("invalid");
    }
}