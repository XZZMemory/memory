package algorithm.yuanfudao;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = in.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = in.nextInt();
        }
        int max = 0;
        int start = 0, end = 0;
        int current = data[start];
        //current当前值还未加上
        while (end < n) {
            while (end < n && current <= s) {
                max = max > end - start + 1 ? max : end - start + 1;
                ++end;
                if (end < n) {
                    current += data[end];
                }
            }
            while (end < n && current > s) {
                current -= data[start];
                start++;
            }
        }
        System.out.println(max);
    }
}
