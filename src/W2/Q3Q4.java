package W2;

public class Q3Q4 {

    static boolean contains(int[] a, int element) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == element)
                return true;
        }
        return false;
    }

    static int count(int[] a, int element) {
        int count = 0;
        for (int i : a) {
            if (i == element)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 5, 5, 5, 3, 8, 1};
        boolean result = contains(array, 5);
        int count = count(array, 5);
        System.out.println(result);
        System.out.println(count);
    }

}
