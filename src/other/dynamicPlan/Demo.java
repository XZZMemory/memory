package other.dynamicPlan;

/**
 * 0-1背包问题
 */
public class Demo {
    public static void main(String[] args) {
        dp();
    }

    public static void dp() {
        int[] w = {0, 2, 3, 4, 5};            //商品的体积2、3、4、5
        int[] v = {0, 3, 4, 5, 6};            //商品的价值3、4、5、6
        int bagV = 8;                            //背包大小
        int[][] dp = new int[5][9];
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= bagV; j++) {
                if (j < w[i])
                    dp[i][j] = dp[i - 1][j];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i]] + v[i]);
            }
        }
        //动态规划表的输出
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.println(dp[i][j]);
            }
            System.out.println();
        }

    }
}
