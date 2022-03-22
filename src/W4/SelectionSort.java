package W4;

import java.util.*;
public class SelectionSort {
    public static ArrayList<String> selectionSort(ArrayList<String> listA, ArrayList<Integer> listB) {
        // TODO
        if (listA == null || listB == null || listA.size() != listB.size())
            return null;

        ArrayList<String> listC = new ArrayList<String>();
        for (int i = 1; i <= listB.size(); i++) {
            int index = listB.indexOf(i);
            listC.add(listA.get(index));
        }
        return listC;
    }

    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<String>();
        ArrayList<Integer> B = new ArrayList<Integer>();
        String[] a = {"One", "Three", "Five", "Nine", "Eight", "Two", "Four", "Seven", "Six"};
        int [] b = {1, 3, 5, 9, 8, 2, 4, 7, 6};
        for (int i=0; i<a.length;i++) {
            A.add(a[i]);
            B.add(b[i]);
        }
        ArrayList<String> listC = selectionSort(A, B);
    }

}