package main.java.chapter1.bags_queues_and_stacks_1_3;

/**
 * @author anshengqiang
 * @email 996374185@qq.com
 * @createtime 2018/4/28 11:32
 * @comment 定容字符串栈
 */
public class FixedCapacityStackOfStrings {

    /**
     * 栈存储字符串的位置
     */
    private String[] a;
    /**
     * 栈的大小
     */
    private int N;

    public FixedCapacityStackOfStrings(int cap) {
        a = new String[cap];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void push(String item) {
        a[N++] = item;
    }

    public String pop() {
        return a[--N];
    }

}
