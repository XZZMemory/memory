package algorithm.jd;

import java.util.Scanner;

//体重问题
public class Main1 {
    //n个人，体重 Hi
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = in.nextInt();
        }
        in.close();
        //横-i 代表当前第几个数字， j-最大可分为几组，result[i][j]-当前i个数字可分为j组的话，最大值是多少
        int[][] result = new int[n + 1][n + 1];
        //初始化，数据肯定能分为一组
        result[0][1] = h[0];
        for (int i = 1; i < result.length; i++) {
            //[i][0]的值是多少
            if (h[i] > result[i - 1][0]) {
                result[i][1] = h[i];
            } else {
                result[i][1] = result[i - 1][0];
            }
        }
        for (int i = 0; i < result.length; i++) {
            //横-i 代表当前第几个数字， j-最大可分为几组，result[i][j]-当前i个数字可分为j组的话，最大值是多少
            for (int j = 1; j <= i; j++) {
                // result[i][j]
//f(i,j)可分为，f(i-1)(j-1)+j f(i-2)
                boolean flag = false;
                //k个人凑够j-1组
                //求k+1人到j人的最小值和最大值
                for (int k = i; k <= j - 1; k++) {
                    int max = 0;
                    int min = Integer.MAX_VALUE;
                    for (int m = k + 1; m <= j; m++) {
                        if (max < h[m]) {
                            max = h[m];
                        }
                        if (min > h[m]) {
                            min = h[m];
                        }
                    }
                    //如果可以凑的话，
                    if (result[k][j] != 0 && result[k][j] <= min) {
                        result[i][j] = max;
                        break;
                    }
                }
            }
        }
        for (int i = result[n].length - 1; i >= 0; i--) {
            if (result[n][i] != 0) {
                System.out.println(i);
                break;
            }
        }

    }
}
