package main.java.chapter1.bags_queues_and_stacks_1_3;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author anshengqiang
 * @email 996374185@qq.com
 * @createtime 2018/4/28 9:09
 * @comment 统计(背包测试用例)
 */
public class Stats {

    public static void main(String[] args) {
        Bag<Double> numbers = new Bag<Double>();
        while (!StdIn.isEmpty()) {
            numbers.add(StdIn.readDouble());
        }
        int N = numbers.size();

        double sum = 0.0;
        for (double x :
                numbers) {
            sum += x;
        }
        //平均值
        double mean = sum/N;

        sum = 0.0;
        for (double x:
                numbers) {
            sum += (x - mean) * (x - mean);
        }
        //标准差
        double std = Math.sqrt(sum/(N-1));

        StdOut.printf("Mean: %.2f\n", mean);
        StdOut.printf("Std dev: %.2f\n", std);
    }

}
