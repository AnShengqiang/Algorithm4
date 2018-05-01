package main.java.chapter1.bags_queues_and_stacks_1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Stack;

/**
 * @author anshengqiang
 * @email 996374185@qq.com
 * @createtime 2018/4/28 10:04
 * @comment 堆栈测试用例
 */
public class Reverse {

    public static void main(String[] args) {
        Stack<Integer> stack;
        stack = new Stack<Integer>();
        while(!StdIn.isEmpty()) {
            stack.push(StdIn.readInt());
        }

        StdOut.println("-------------------------");

        for (int i :
                stack) {
            StdOut.println(i);
        }

        StdOut.println("-------------------------");

        while(!stack.isEmpty()) {
            StdOut.println(stack.pop());
        }

    }

}
