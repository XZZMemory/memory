package algorithm.beiketwo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 第一行两个正整数n,S
 * <p>
 * 第二行n个正整数,第i个正整数为c[i]
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = in.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = in.nextInt();
        }
        in.close();
        Arrays.sort(c);
        int sum = 0;
        for (int price : c) {
            if (price > s) {
                break;
            }
            ++sum;
            s -= price;
        }
        System.out.println(sum);
    }
}
