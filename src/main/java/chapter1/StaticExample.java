package chapter1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author 安升强
 * @创建时间 2018/4/14
 * @描述 一些静态方法例子
 */
public class StaticExample {

    /**
     * @创建时间 2018/4/14 11:51
     * @描述 整数绝对值
     */
    public static int abs(int x) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
    }

    /**
     * @创建时间 2018/4/14 11:52
     * @描述 浮点数绝对值
     */
    public static double abs(double x) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
    }

    /**
     * @创建时间 2018/4/14 11:56
     * @描述 判断一个数是否是素数
     */
    public static boolean isPrime(int N) {
        if (N < 2) {
            return false;
        }

        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                return true;
            }
        }

        return false;
    }

    /**
     * @创建时间 2018/4/14 12:02
     * @描述 牛顿迭代法求平方根
     */
    public static double sqrt(double c) {
        if (c < 0) {
            return Double.NaN;
        }
        double err = 1e-15;
        double t = c;
        while (Math.abs(t - c / t) > err * t) {
            t = (c / t + t) / 2.0;
        }
        return t;
    }

    /**
     * @创建时间 2018/4/14 13:21
     * @描述 求三角形斜边边长
     */
    public static double hypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    /**
     * @创建时间 2018/4/14 13:23
     * @描述 计算调和级数
     */
    public static double H(int N) {
        double sum = 0.0;
        for (int i = 1; i <= N; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    public static void changeArray(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            strings[i] = i+ " " + i + " " + i + " ";
        }

        for (String s :
                strings) {
            System.out.println("      " + s);
        }
    }

    public static void main(String[] args) {
        String[] s = {"123", "ddddd", "dasf"};
        for (String string : s) {
            System.out.println(s);
        }

        changeArray(s);

        for (String string : s) {
            System.out.printf("%s", string);
        }
    }

}
