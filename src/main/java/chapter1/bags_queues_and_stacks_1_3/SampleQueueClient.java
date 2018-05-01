package main.java.chapter1.bags_queues_and_stacks_1_3;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Queue;

/**
 * @author      anshengqiang
 * @email       996374185@qq.com
 * @createtime  2018/4/28 9:52
 * @comment     队列用例
 */
public class SampleQueueClient {

    /**
     * @创建时间 2018/4/28 10:00
     * @描述     读取输入的整数，存入队列。再将队列中的整数出队,存入数组。
     */
    public static int[] readInts(String name) {
        In in = new In(name);
        Queue<Integer> q = new Queue<Integer>();
        while (!in.isEmpty()) {
            q.enqueue(in.readInt());
        }
        int N = q.size();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = q.dequeue();
        }
        return a;
    }

}
