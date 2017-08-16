package sort;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by anshengqiang on 2017/7/27.
 */
public class Selection {
    public static void sort(Comparable[] a){
        int N = a.length;
        for (int i = 0; i < N; i++){
            int min = i;
            for (int j = i+1; j < N; j++){
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exch(a, i, min);
            System.out.println("交换" + a[i] + "与" + a[min]);
        }
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

    private static boolean isSorted(Comparable[] a){
        for (int i = 1; i < a.length; i++){
            if (less(a[i], a[i-1])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
//        String[] a = In.readStrings();
        String[] a = {"ff", "22", "3.3", "1.12", "1", "12", "da", "999", "9.99", "bb", "bc", "db"};
        show(a);
        sort(a);
//        assert isSorted(a);
        StdOut.println(String.valueOf(isSorted(a)));
//        StdOut.println(String.valueOf(less(String.valueOf("3.3"), String.valueOf("22"))));
        show(a);
    }
}
