package algorithm.xiaohongshu;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//棋盘长度n 0 -> n-1
        int m = sc.nextInt();//棋盘m 0 -> m-1
        int k = sc.nextInt();//障碍物个数
        int[][] data = new int[n][m];
        while (k > 0) {//障碍物数据
            int i = sc.nextInt();
            int j = sc.nextInt();
            data[i][j] = -1;
            k--;
        }
        int[][] value = new int[n][m];
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value[0].length; j++) {
                value[i][j] = Integer.MAX_VALUE;
            }
        }
        //到底是是m+1还是m
        //递归或者动态规划，每次都要更新的
        transfer(data, 0, 0, -1, value);
        if (value[value.length - 1][value[0].length - 1] != Integer.MAX_VALUE) {
            System.out.println(value[value.length - 1][value[0].length - 1]);
        } else {
            System.out.println(0);
        }
    }

    public static void transfer(int[][] data, int i, int j, int lastValue, int[][] value) {

        if (i < 0 || j < 0 || i >= data.length || j >= data[0].length) {
            return;
        }
        if (data[i][j] == -1) {//有障碍物
            return;
        } else if (lastValue + 1 < value[i][j]) {
            value[i][j] = lastValue + 1;
            if (i == data.length - 1 && j == data[0].length - 1) {
                return;
            }
            transfer(data, i - 1, j, value[i][j], value);
            transfer(data, i, j - 1, value[i][j], value);
            transfer(data, i, j + 1, value[i][j], value);
            transfer(data, i + 1, j, value[i][j], value);
        }


    }
}
