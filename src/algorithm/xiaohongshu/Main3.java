package algorithm.xiaohongshu;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());//迷宫n*n
        int[][] data = new int[n + 1][n + 1];
        int[][] result = new int[n + 1][n + 1];
        int[] start = new int[2];
        int[] end = new int[2];
        //记录起点、终点、障碍
        for (int i = 1; i <= n; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < n; j++) {
                System.out.println(j);
                char c = str.charAt(j);
                if (c == 'S') {
                    start[0] = i;
                    start[1] = j + 1;
                    data[i][j + 1] = 0;
                } else if (c == 'E') {
                    end[0] = i;
                    end[1] = j + 1;
                } else if (c == '#') {
                    data[i][j + 1] = -1;
                } else if (c == '…') {
                    j += 3;
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = Integer.MAX_VALUE;
            }
        }
        transfer(data, start[0], start[1], -1, result, end);
        if (result[end[0]][end[1]] != Integer.MAX_VALUE) {
            System.out.println(result[end[0]][end[1]]);
        } else {
            System.out.println(-1);
        }
    }

    public static void transfer(int[][] data, int i, int j, int lastValue, int[][] value, int[] end) {
        i = i % data.length;
        j = j % data.length;
        if (data[i][j] == -1) {//有障碍物
            return;
        } else if (lastValue + 1 < value[i][j]) {
            value[i][j] = lastValue + 1;
            if (i == end[0] && j == end[1]) {
                return;
            }
            transfer(data, i - 1 + data.length, j, value[i][j], value, end);
            transfer(data, i, j - 1 + data.length, value[i][j], value, end);
            transfer(data, i, j + 1, value[i][j], value, end);
            transfer(data, i + 1, j, value[i][j], value, end);
        }
    }
}
