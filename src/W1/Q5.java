package W1;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter mark: ");
        float mark = a.nextFloat();
        String Grade;
        if (mark >= 85) {
            Grade = "HD";
        }
        else if (mark >= 75) {
            Grade = "D";
        }
        else {
            Grade = "Other";
        }
        System.out.println("The student will be awarded a " + Grade + ".");
    }
}
