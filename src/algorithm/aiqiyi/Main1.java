package algorithm.aiqiyi;

import java.util.Scanner;

public class Main1 {
    //使用动态规划
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n - 1];
        for (int i = 0; i < n-1; i++) {
            a[i] = in.nextInt();
        }
        int[] result = new int[n];
        for (int i = 0; i <n; i++) {
            result[i] = i+1;
        }
        System.out.println(find(a, 0, result));
    }

    // i 从0开始
    public static int find(int[] a, int i, int[] result) {
        if (i >= result.length) {
            return 1;
        }
        int count = 0;
        for (int j = i; j < result.length; j++) {
            swap(result, i, j);
            if (i == 0) {
                count += find(a, i + 1, result);
            } else if ((a[i-1] == 1 && result[i - 1] - result[i] > 0) || (a[i-1] == 0 && result[i - 1] - result[i] < 0)) {
                count += find(a, i + 1, result);
            }
            swap(result, i, j);
        }
        return count;
    }

    public static void swap(int[] temp, int i, int j) {
        int data = temp[i];
        temp[i] = temp[j];
        temp[j] = data;
    }
}

