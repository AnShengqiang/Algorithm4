package sort;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by anshengqiang on 2017/7/28.
 */
public class SortTemplate {
    public static void sort(Comparable[] a) {
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(Comparable[] a){
        for (int i = 0; i < a.length; i++){
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }

    public static boolean isSorted(Comparable[] a){
        for (int i = 1; i < a.length; i++){
            if (less(a[i], a[i-1])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String[] a = {"ff", "22", "3.3", "1.12", "1", "12", "da", "999", "9.99", "bb", "bc", "db"};
        sort(a);
        StdOut.println(String.valueOf(isSorted(a)));
        show(a);
    }
}
