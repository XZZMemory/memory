package algorithm.xiecheng.third;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int size = in.nextInt();
        int[] dataArray = new int[size];
        for (int i = 0; i < size; i++) {
            dataArray[i] = in.nextInt();
        }
        System.out.println(schedule(m, dataArray));
    }

    static int schedule(int m, int[] dataArray) {
        //使用二分法
        int left = 0, right = 0;
        for (int i = 0; i < dataArray.length; i++) {
            left = Math.max(left, dataArray[i]);
            right += dataArray[i];
        }
        int mid;
        while (left < right) {
            mid = (left + right) >> 1;
            //判断当每个子序列最大执行时间是mid，可以分成多少个子序列，子序列值的数量是k
            int t = 1, sum = dataArray[0];
            for (int i = 1; i < dataArray.length; i++) {
                if (sum + dataArray[i] <= mid) {
                    sum += dataArray[i];
                } else {
                    ++t;
                    if (t > m) {
                        break;
                    }
                    sum = dataArray[i];
                }
            }
            //已获得子序列的值k
            if (t > m) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return right;
    }
}

