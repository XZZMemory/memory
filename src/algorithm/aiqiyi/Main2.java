package algorithm.aiqiyi;

import java.util.Scanner;
import java.util.Stack;

public class Main2 {
    //排列组合问题。。。。使用动态规划
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.println(find(n, m));
    }

    //n 红-胜
    public static float find(float n, float m) {
        float a = n / (m + n);
        if (m <= 3) {
            return a;
        } else {
            float data = m / (m + n);//a没拿到
            m--;
            data *= m / (m + n);//b没拿到
            m--;
            data *= m / (m + n);//c没拿到
            m--;
            return (a + data * find(n, m));
        }
    }
}
