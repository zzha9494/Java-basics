package W2;

import java.util.Scanner;

public class WhoWillPass {
    static double totalMark(int[] marks) {
        return (marks[0] + marks[1] + marks[2]) * 0.04 + (marks[3] + marks[4]) * 0.1 + marks[5]*0.18 + marks[6] * 0.5;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] marks = new int [7];

        for (int i = 0; i < 7; i++) {
            if (scan.hasNextInt()){
                marks[i] = scan.nextInt();
                if (marks[i] < 0 || marks[i] > 100){
                    System.out.println("Invalid Input");
                    break;}
                if (i == 6) {
                    double totalMark = totalMark(marks);
                    if (totalMark >= 50 && marks[6] >= 40)
                        System.out.println("Pass");
                    else
                        System.out.println("Fail");
                }
            }
            else {
                System.out.println("Invalid Input");
                break;
            }
        }
    }

}
