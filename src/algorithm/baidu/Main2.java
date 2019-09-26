package algorithm.baidu;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        int times = 0;
        while (a[n - 1] >= n) {
            ++times;
            a[n - 1] = a[n - 1] - 1;
            int i = n - 2;
            while (i >= 0) {
                a[i] = a[i] + 1;
                --i;
            }
            i = n - 2;
            while (i >= 0 && a[i] > a[i + 1]) {
                swap(a, i, i + 1);
                --i;
            }
        }
        System.out.println(times);
    }

    public static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}
