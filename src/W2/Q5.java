package W2;

public class Q5 {

    static int countDuplicates(int[] a) {
        if (a == null)
            return 0;

        int[] dups = new int[a.length/2];
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            boolean existsInDup = false;

            for (int num = 0; num < count; num++) {
                if (a[i] == dups[num]) {
                    existsInDup = true;
                    break;
                }
            }

            if (! existsInDup) {
                for (int j = 0; j < a.length; j++){
                    if (j != i) {
                        if (a[i] == a[j]) {
                            dups[count] = a[i];
                            count++;
                            break;
                        }
                    }
                }

            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] dups = {1, 1, 5, 6, 5, 3, 8, 1, 9, 2, 8};
        int result = countDuplicates(dups);
        System.out.println(result);
    }

}
