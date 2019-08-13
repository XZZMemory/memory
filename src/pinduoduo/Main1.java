package pinduoduo;

import java.util.Arrays;
import java.util.Scanner;

//组合中方差最小的
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n < 3) {
            System.out.println("数据必须大于3个！");
            return;
        }
        int[] dataArray = new int[n];
        for (int i = 0; i < n; i++) {
            dataArray[i] = in.nextInt();
        }
        Arrays.sort(dataArray);
        double result = Double.MAX_VALUE;
        for (int i = 1; i < dataArray.length - 1; i++) {
            int data1 = dataArray[i - 1];
            int data2 = dataArray[i];
            int data3 = dataArray[i + 1];
            double avg = ((double) (data1 + data2 + data3)) / 3;
            double temp = Math.pow((data1 - avg), 2) + Math.pow(data2 - avg, 2) + Math.pow(data3 - avg, 2);
            double currentResult = temp / 3;
            result = result < currentResult ? result : currentResult;
        }
        System.out.println(String.format("%.2f", result));

    }
}
