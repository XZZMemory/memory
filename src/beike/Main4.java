package beike;

import java.util.Scanner;

/* [ 1，2，2，1 ]，[ 2，1，2 ]和[ 10，10 ]。现在给你一个请求队列，
你可以对请求的负荷值进行增加，要求你调整队列中请求的负荷值
，使数组满足条件。最后输出使队列满足条件最小的增加总和。*/
public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();//请求队列的数量
        int[] requestWeight = new int[n];//请求的负荷值
        for (int i = 0; i < n; i++) {
            requestWeight[i] = in.nextInt();
        }
        //违反数据规则的前一个数据
        int start = 0;
        int end = requestWeight.length - 1;
        int plusWeight = 0;

        while (start < end && requestWeight[start + 1] > requestWeight[start]) {
            ++start;
        }
        while (start < end && requestWeight[end - 1] > requestWeight[end]) {
            --end;
        }
        while (start < end) {
            requestWeight[start + 1] = requestWeight[start] + 1;
            plusWeight += 1;
            while (start < end && requestWeight[start + 1] > requestWeight[start]) {
                ++start;
            }
            while (start < end && requestWeight[end - 1] > requestWeight[end]) {
                --end;
            }
            if (start < end) {
                requestWeight[end - 1] = requestWeight[end] + 1;
                plusWeight += 1;
            }
            while (start < end && requestWeight[end - 1] > requestWeight[end]) {
                --end;
            }
            while (start < end && requestWeight[start + 1] > requestWeight[start]) {
                ++start;
            }

        }
        /*
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
        }*/
        System.out.println(plusWeight);
    }
}
