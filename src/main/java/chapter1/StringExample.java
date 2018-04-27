package main.java.chapter1;

public class StringExample {

    /**
     * @创建时间 2018/4/25 9:06
     * @描述 判断一个字符串是否是回文序列
     */
    public static boolean isPalindrom(String s) {
        int N = s.length();
        for (int i = 0; i < N / 2; i++) {
            if (s.charAt(i) != s.charAt(N-1-i)) {
                return false;
            }
        }
        return true;
    }



}
