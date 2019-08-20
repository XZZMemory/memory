package algorithm.three;

import java.util.Scanner;

/**
 * N * M 矩阵 n 行，m列
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] data = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                data[i][j] = in.nextInt();
            }
        }
        printArea2(n, m, data);
    }

    public static void printArea(int n, int m, int[][] data) {
        //面积减少分为3部分
        int reduceNum = 0;
        // 1.左右两点
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m - 1; j++) {
                int left = data[i][j];
                int right = data[i][j + 1];
                int dif = Math.min(left, right);
                reduceNum += dif;
            }
        }
        // 2.上下两点
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                int left = data[i][j];
                int right = data[i][j + 1];
                int dif = Math.min(left, right);
                reduceNum += dif;
            }
        }
        reduceNum = reduceNum * 2;
        // 3.单个柱体
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int level = data[i][j];
                sum += data[i][j];
                reduceNum += ((level - 1) * 2);
            }
        }
        System.out.println(sum * 6 - reduceNum);
    }

    public static void printArea2(int n, int m, int[][] data) {

        int rs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int tmp = data[i][j];
                if (tmp > 0) {
                    rs += 1 + 1 + tmp * 4;
                    if (j < m - 1 && data[i][j + 1] > 0) {
                        rs -= Math.min(tmp, data[i][j + 1]);
                    }
                    if (i < n - 1 && data[i + 1][j] > 0) {
                        rs -= Math.min(tmp, data[i + 1][j]);
                    }
                    if (i > 0 && data[i - 1][j] > 0) {
                        rs -= Math.min(tmp, data[i - 1][j]);
                    }
                    if (j > 0 && data[i ][j- 1] > 0) {
                        rs -= Math.min(tmp, data[i ][j-1]);
                    }
                }
            }
        }
        System.out.println(rs);
    }
}
