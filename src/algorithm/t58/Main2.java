package algorithm.t58;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = in.nextInt();
        }
        int count = 0;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int left = (i - 1) >= 0 ? data[i - 1] : 0;
            int right = (i + 1) < n ? data[i + 1] : Integer.MAX_VALUE;
            if (data[i] < left && data[i] < right) {
                result[i] = 1;
            } else if (data[i] < left && data[i] > right) {
                result[i] = 2;
            } else if (data[i] > left) {
                if (i == 0 && data[i] > right) {
                    result[i] = 2;
                } else if (i == 0 && data[i] < right) {
                    result[i] = 1;
                } else {
                    result[i] = result[i - 1] + 1;
                }
            }
            count += result[i];
        }
        System.out.println(count);
    }
}
