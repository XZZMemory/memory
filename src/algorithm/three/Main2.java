package algorithm.three;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    //n个数，m进制
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] data1 = new int[n];
        int[] data2 = new int[n];
        for (int i = 0; i < n; i++) {
            data1[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            data2[i] = in.nextInt();
        }
        in.close();
        print(n, m, data1, data2);
    }

    public static void print(int n, int m, int[] data1, int[] data2) {
        Arrays.sort(data1);
        Arrays.sort(data2);
        reverse(data1);
        reverse(data2);
        int[] result = new int[n];
        int index = 0;
        int start = 0;
        int end = n - 1;
        for (int i = 0; i < n; i++) {
            int startData = data2[start];
            int endData = data2[end];
            int currentData = data1[i];
            if ((currentData + startData) % m > (currentData + endData) % m) {
                result[index] = (currentData + startData) % m;
                ++start;
            } else {
                result[index] = (currentData + endData) % m;
                --end;
            }
            ++index;
        }
        Arrays.sort(result);
        reverse(result);
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static void reverse(int[] data) {
        int start = 0;
        int end = data.length - 1;
        while (start < end) {
            int temp = data[start];
            data[start] = data[end];
            data[end] = temp;
            ++start;
            --end;
        }
    }
}
