package W3;

public class test {
    public static void main(String[] args) {
        for (int i=0; i < 10; i++) {
            int b = -2 * (i%4 / 3);
            int a = i%4;
            double c = (a + b)/2.0 - 0.5;

            System.out.println(c);
        }
    }
}
