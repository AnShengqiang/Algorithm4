package chapter1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 安升强
 * @创建时间 2018/4/14
 * @描述 关于double数组的一些方法示例
 */
public class ArrayUtils {

    /**
     * @创建时间 2018/4/14 9:37
     * @描述 数组最大值
     */
    public static double max(double[] a) {
        double max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }

        return max;
    }

    /**
     * @创建时间 2018/4/14 9:48
     * @描述 数组平均值
     */
    public static double average(double[] a) {
        int N = a.length;
        double sum = 0.0;
        for (int i = 0; i < N; i++) {
            sum += a[i];
        }
        return sum / N;
    }

    /**
     * @创建时间 2018/4/14 9:51
     * @描述 复制数组
     */
    public static double[] copy(double[] a) {
        int N = a.length;
        double[] b = new double[N];
        for (int i = 0; i < N; i++) {
            b[i] = a[i];
        }

        return b;
    }

    /**
     * @创建时间  2018/4/14 10:02
     * @描述  颠倒数组元素
     */
    public static double[] reverse(double[] a) {
        int N = a.length;
        for (int i = 0; i < N / 2; i++) {
            double temp = a[i];
            a[i] = a[N - 1 - i];
            a[N - 1 - i] = temp;
        }

        return a;
    }

    /**
     * @创建时间  2018/4/14 10:51
     * @描述  矩阵相乘: c[][] = a[][] * b[][]
     */
    public static double[][] matrixMultiplication(double[][] a, double[][] b) {

        if (!(a.length > 0 && b.length > 0)) {
            return null;
        }

        if (a[0].length != b.length) {
            return null;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[0].length != a[i].length) {
                return null;
            }
        }

        for (int i = 0; i < b.length; i++) {
            if (b[0].length != b[i].length) {
                return null;
            }
        }

        int N = a.length;
        double[][] c = new double[N][N];
        //i：数组a的行数
        for (int i = 0; i < N; i++) {
            //j：数组b的列数
            for (int j = 0; j < N; j++) {
                //k：数组a的列数（也是数组b的行数）
                for (int k = 0; k < N; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> array = new ArrayList<Double>();
        String s = scanner.nextLine();
        String[] s1 = s.split(" ");
        for (int i = 0; i < s1.length; i++) {
            array.add(Double.valueOf(s1[i]));
        }

        double[] d = new double[array.size()];
        for (int i = 0; i < array.size(); i++) {
            d[i] = array.get(i);
        }

        System.out.printf("转换前：");
        for (int i = 0; i < d.length; i++) {
            System.out.printf("%f ", d[i]);
        }
        reverse(d);

        System.out.printf("\n");

        System.out.printf("转换后：");
        for (int i = 0; i < d.length; i++) {
            System.out.printf("%f ", d[i]);
        }
    }
}
