package a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();//请求队列的数量
        int[] requestWeight = new int[n];//请求的负荷值
        for (int i = 0; i < n; i++) {
            requestWeight[i] = in.nextInt();
        }
        int plusWeight = 0;
        for (int i = 1; i < requestWeight.length; i++) {
            boolean flag = false;//是否是递减序列，后面的
            for (int j = 1; j < n - 1; j++) {
                if (requestWeight[j] < requestWeight[j + 1]) {
                    flag = true;
                    break;
                }
            }
            if (requestWeight[i] <= requestWeight[i - 1]) {
                if (flag) {
                    plusWeight += (requestWeight[i - 1] - requestWeight[i] + 1);
                    requestWeight[i] = requestWeight[i - 1] + 1;
                }
            }
        }
        System.out.println(plusWeight);
    }
}
