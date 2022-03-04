package W2;

import java.util.Scanner;

public class Occurrence {
    static int countNum(int[] nums, int element) {
        int count = 0;
        for (int i:nums)
            if (i == element)
                count++;
        return count;
    }


    public static void main(String[] args) {
        //YOUR CODE HERE
        Scanner x = new Scanner(System.in);
        String numbers = x.nextLine();
        int[] nums = new int[numbers.length()];
        for (int i=0; i<numbers.length(); i++){
            nums[i] = numbers.charAt(i) - '0';
        }
        int[] results = new int[10];
        for (int i = 0; i < 10; i++)
            System.out.println(i + ": " + countNum(nums, i));
    }

}