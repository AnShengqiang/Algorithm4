package sort;

import edu.princeton.cs.algs4.StdOut;

import static sort.Merge.merge;

public class MergeBU {

    private static Comparable[] aux;

    public static void sort(Comparable[] a) {
        int N = a.length;
        aux = new Comparable[N];
        for (int sz = 1; sz < N; sz = sz+sz)
            for (int lo = 0; lo < N-sz; lo += sz+sz)
                merge(a, lo, lo+sz-1, Math.min(lo+sz+sz-1, N-1));
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void show(Comparable[] a){
        for (int i = 0; i < a.length; i++){
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }

    public static boolean isSorted(Comparable[] a){
        for (int i = 1; i < a.length; i++){
            if (less(a[i], a[i-1])) return false;
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
