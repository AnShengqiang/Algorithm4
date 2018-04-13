package sort;

import edu.princeton.cs.algs4.StdOut;

import static sort.SortUtils.*;

/**
 * Created by anshengqiang on 2017/7/31.
 * 插入排序，往前比较，较小就插入。从1开始，1与0比，2与1、0比，3与2、1、0比。
 */
public class Insertion {
    public static void sort(Comparable[] a){
        int N = a.length;
        for (int i = 1; i < N; i++){
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--){
                exch(a, j, j-1);
            }
        }
    }

    public static void main(String[] args){
//        String[] a = In.readStrings();
        String[] a = {"ff", "22", "3.3", "1.12", "1", "12", "da", "999", "9.99", "bb", "bc", "db"};
        sort(a);
//        assert isSorted(a);
        StdOut.println(String.valueOf(isSorted(a)));
        show(a);
    }
}
