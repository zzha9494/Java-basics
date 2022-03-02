package W1;

public class Q7 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);
        if (x < y && x < z){
            if (y < z) {
                System.out.println(x);
                System.out.println(y);
                System.out.println(z);
            }
            else {
                System.out.println(x);
                System.out.println(z);
                System.out.println(y);
            }
        }
    }
}
