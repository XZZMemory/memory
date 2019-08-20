package algorithm.beike;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        //考虑使用动态规划
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] dataArray = new long[n];
        for (int i = 0; i < n; i++) {
            dataArray[i] = in.nextLong();
        }
        long result = 1;//dp数组中的最大值
        /* dp[i] 表示已 a[i]结尾的最长上升子序列*/
        long[] dp = new long[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 1;//初始化为1
            for (int j = 0; j < i; j++) {
                if (dataArray[i] > dataArray[j] && (dp[j] + 1) > dp[i]) {
                    dp[i] = dp[j] + 1;
                }
            }
            result = result > dp[i] ? result : dp[i];
        }
        System.out.println(result);
    }
}
