package W1;

import java.util.Random;

public class Q6 {
    public static void main(String[] args) {
        Random a = new Random();
        int number = a.nextInt(6) + 1;
        System.out.println(number);
//==============================
        int number1 = (int) (Math.random() * 6 + 1);
        System.out.println(number1);
    }
}
