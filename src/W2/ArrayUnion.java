package W2;

import java.util.Arrays;

public class ArrayUnion {

    public static int[] union(int[] a, int[] b) {
        if (a ==null || b == null)
            return null;

        int[] xy = new int[a.length + b.length];
        int[] unique = new int[a.length + b.length];
        for (int i = 0;i<a.length;i++)
            xy[i] = a[i];
        for (int i = 0;i<b.length;i++)
            xy[a.length + i] = b[i];

        Arrays.sort(xy);

        int temp = 0;
        int count_unique = 0;
        for(int i=0; i<xy.length; i++) {
            if (i == 0) {
                temp = xy[i];
                unique[count_unique++] = temp;
            }
            if (xy[i] != temp) {
                temp = xy[i];
                unique[count_unique++] = temp;
            }


        }

        int[] union = new int[count_unique];
        for(int i = 0;i<count_unique;i++)
            union[i] = unique[i];



        return union;

    }


    public static void main(String[] args) {
        int[] x = {3, 2, 7};
        int[] y = {3, 8, 9};

        int[] a = union(x, y);
        for(int i: a)
            System.out.print(i);
    }

}