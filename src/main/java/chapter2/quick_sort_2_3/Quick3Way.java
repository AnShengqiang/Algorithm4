package main.java.chapter2.quick_sort_2_3;

import static sort.SortUtils.exch;

/**
 * @author anshengqiang
 * @email 996374185@qq.com
 * @createtime 2018/5/4 9:52
 * @comment 三取样拆分快速排序
 */
public class Quick3Way {

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }

        int lt = lo;
        int i = lo + 1;
        int gt = hi;

        Comparable v = a[lo];
        while (i <= gt) {
            int cmp = a[i].compareTo(v);
            if (cmp < 0) {
                exch(a, lt++, i++);
            }else if (cmp > 0) {
                exch(a, i, gt--);
            }else {
                i++;
            }
        }

        sort(a, lo, lt-1);
        sort(a, gt+1, hi);
    }

}
