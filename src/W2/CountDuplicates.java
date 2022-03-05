package W2;

public class CountDuplicates {


    public static int countDuplicates(int[] a) {
        if (a == null)
            return 0;

        int[] dups = new int[a.length/2];
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            boolean isDup = false;
            for (int num: dups) {
                if (a[i] == num){
                    isDup = true;
                    break;
                }
            }

            if (!isDup) {
                for (int j = 0;j<a.length;j++) {
                    if (i !=j ) {
                        if (a[i] == a[j]){
                            dups[count++] = a[i];
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

        int result = countDuplicates(dups); //3
        System.out.println(result);


    }

}