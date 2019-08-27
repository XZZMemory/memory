package algorithm.jd;

import java.util.Scanner;

//体重问题
public class Main11 {
    //n个人，体重 Hi
    public static void main(String[] args) {
        /**
         *
         Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         int[] h = new int[n];
         for (int i = 0; i < n; i++) {
         h[i] = in.nextInt();
         }
         in.close();
         */
        int n = 4;
        int[] h = new int[]{2, 1, 3, 2};
        //横-i 代表当前第几个数字， j-最大可分为几组，result[i][j]-当前i个数字可分为j组的话，最大值是多少
        int[][] result = new int[n + 1][n + 1];
        //初始化，数据肯定能分为一组
        result[1][1] = h[0];
        for (int i = 2; i < result.length; i++) {
            //[i][0]的值是多少
            if (h[i-1] > result[i-1][1]) {
                result[i][1] = h[i-1];
            } else {
                result[i][1] = result[i-1][1];
            }
        }
        for (int i = 2; i < result.length; i++) {
            //横-i 代表当前第几个数字， j-最大可分为几组，result[i][j]-当前i个数字可分为j组的话，最大值是多少
            //当前数字的值是h[i-1]
            for (int j = i; j >= 1; j--) {
                //往前找，比他小的数字，自己可以分为一组
                if (result[i - 1][j - 1] != 0) {
                    if (result[i - 1][1] <= h[i - 1]) {
                        result[i][j] = result[i - 1][j - 1] + 1;
                        i = 0;
                    } else {
                        //自己不能成一组，要和前面的称为一组，找到前面分组比他小的数字
                        int index = i - 2;
                        while (index >= 1) {
                            if (result[index][0] > h[i - 1]) {
                                break;
                            }
                        }
                        for (int k = index; k >= 1; k--) {
                            if (result[index][k] != 0) {
                                result[i][j] = result[index][k] + 1;
                                break;
                            }
                        }
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
