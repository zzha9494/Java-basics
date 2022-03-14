package W3;

import java.util.Scanner;

public class Binary {

    // Returns decimal representation of given binary number.
    public static int toDecimal(String b) {

        // TODO
        int num = b.length();
        int[] sum = new int[num];
        for (int i = 0; i < num; i++) {
            sum[i] = b.charAt(num-1-i) - '0';
        }

        int result = 0;
        for (int i = 0; i<num; i++) {
            result += sum[i] * Math.pow(2, i);
        }
        return result;
    }

    // Returns whether or not given string is a binary number.
    public static boolean isBinary(String b) {

        // TODO
        for (int i = 0; i < b.length(); i++) {
            char temp = b.charAt(i);
            if (temp != '0' && temp != '1')
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        // TODO
        System.out.print("Enter binary: ");
        Scanner scan = new Scanner(System.in);
        String b = scan.next();

        if (isBinary(b)) {
            System.out.println("\n" + toDecimal(b) + " in decimal");
        }
        else
            System.out.println("\nNot binary!");

    }
}