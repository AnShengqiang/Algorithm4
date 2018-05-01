package main.java.chapter1.bags_queues_and_stacks_1_3;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author anshengqiang
 * @email 996374185@qq.com
 * @createtime 2018/4/28 10:21
 * @comment Dijkstra双栈算术表达式求值算法。 表达式例子：( ( ( 1 + 2 ) + ( 2 * 2 ) ) + sqrt ( 64 ) )
 */
public class Evaluate {

    public static void main(String[] args) {
        // 创建两个栈，一个用来存操作符(ops)，一个用来存数字(vals)
        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();
        while(!StdIn.isEmpty()) {
            // 把运算符放入操作符栈(ops)
            String s = StdIn.readString();
            if(s.equals("(")) {
            } else if (s.equals("+")) {
                ops.push(s);
            } else if (s.equals("-")) {
                ops.push(s);
            } else if (s.equals("*")) {
                ops.push(s);
            } else if (s.equals("/")) {
                ops.push(s);
            } else if (s.equals("sqrt")) {
                ops.push(s);
            } else if (s.equals(")")) {
                // 当输入为")"字符的时候，弹出数字，字符串，进行运算，结果存回数字栈。
                String op = ops.pop();
                double v = vals.pop();
                if (op.equals("+")) {
                    v = vals.pop() + v;
                } else if (op.equals("-")) {
                    v = vals.pop() - v;
                } else if (op.equals("*")) {
                    v = vals.pop() * v;
                } else if (op.equals("/")) {
                    v = vals.pop() / v;
                } else if (op.equals("sqrt")) {
                    v = Math.sqrt(v);
                }
                vals.push(v);
            }
            else {
                // 当输入为其它(默认为数字，其它字符会报错)的时候，把数值转为double类型，存入数值栈。
                vals.push(Double.parseDouble(s));
            }
        }
        StdOut.println(vals.pop());
    }

}
