package algorithm.bilibili;

//0-1背包问题

import java.util.Scanner;

/**
 * 5 物品数量N
 * 10 背包称重 M
 * 2 2 6 5 4  物品重量w
 * 6 3 5 4 6  物品价值 V
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] w = new int[n];
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            v[i] = in.nextInt();
        }
        in.close();
        int[][] c = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            c[i][0] = 0;
        }
        for (int i = 0; i <= m; i++) {
            c[0][i] = 0;
        }
        //i- 物品 j-重量
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                c[i][j] = c[i - 1][j];
                //当前件的重量小于总重量，可以放进去或拿出别的东西再放进去
                //当前物品在w、v数组中，实际的下标是 ∫∫i-1
                if (w[i - 1] <= j) {
                    //比较不放这个物品的价值和这个物品的 价值加上当前能放的总重量减去当前物品的重量时，取前i-1个物品时对应重量的最高价值
                    if (c[i - 1][j - w[i - 1]] + v[i - 1] > c[i - 1][j]) {
                        c[i][j] = c[i - 1][j - w[i - 1]] + v[i - 1];
                    }

                }
            }
        }
        System.out.println(c[n][m]);
    }
}
