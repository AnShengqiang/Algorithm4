package chapter1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

import static edu.princeton.cs.algs4.BinarySearch.rank;

/**
 * @author 安升强
 * @创建时间 2018/4/13
 * @描述 二分查找
 */
public class BinarySearch {

    public static int rank(int key, int[] a) {

        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo)/2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] whiteList = {1, 2, 3, 0, 10, 33, 51, 4, 5, 6, 9, 11};
        Arrays.sort(whiteList);

        while(!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, whiteList) == -1) {
                StdOut.println("没找到" + key);
            } else {
                StdOut.println("找到了" + key);
            }
        }
    }

}