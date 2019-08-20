package algorithm.beike;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n < 2) {
            System.out.println("数据必须大于2个！");
            return;
        }
        long[] dataArray = new long[n];
        for (int i = 0; i < n; i++) {
            dataArray[i] = in.nextLong();
        }
        long dis = Long.MAX_VALUE;
        int result = -1;//存储前一个数据
        for (int i = 0; i < dataArray.length - 1; i++) {
            long currentDis = Math.abs(dataArray[i] - dataArray[i + 1]);
            if (currentDis < dis) {
                dis = currentDis;
                result = i;
            }
        }
        System.out.println(dataArray[result] + " " + dataArray[result + 1]);

    }
}
