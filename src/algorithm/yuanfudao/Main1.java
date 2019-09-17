package algorithm.yuanfudao;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] result = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = in.nextInt();
            }
        }
        int left = 0, right = n - 1, botoom = m - 1, top = 0;
        while (left <= right && top <= botoom) {
            //左竖，纵为left
            for (int i = top; i <= botoom; i++) {
                System.out.print(result[i][left] + " ");
            }
            ++left;
            //横为bootom
            if (left <= right && top <= botoom) {
                for (int i = left; i <= right; i++) {
                    System.out.print(result[botoom][i] + " ");
                }
                --botoom;
            }
            // 右竖
            if (left <= right && top <= botoom) {
                for (int i = botoom; i >= top; i--) {
                    System.out.print(result[i][right] + " ");
                }
                --right;
            }
            //上横
            if (left <= right && top <= botoom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(result[top][i] + " ");
                }
                ++top;
            }
        }
    }
}
