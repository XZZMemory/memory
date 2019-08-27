package algorithm.beiketwo;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] weightArray = new int[n];
        for (int i = 0; i < weightArray.length; i++) {
            weightArray[i] = in.nextInt();
        }
        in.close();
        Arrays.sort(weightArray);
        int start = 0;
        int end = weightArray.length - 1;
        int sum1 = 1;
        int sum2 = 1;
        int weight1 = weightArray[start];
        int weight2 = weightArray[end];
        ++start;
        --end;
        while (start <= end) {
            while (start <= end && weight1 <= weight2) {
                weight1 += weightArray[start];
                sum1++;
                ++start;
            }
            while (start <= end && weight1 > weight2) {
                weight2 += weightArray[end];
                sum2++;
                --end;
            }
        }
        int dif = Math.abs(weight1 - weight2);
        int sum = Math.abs(sum1 - sum2);
        System.out.println(dif + " " + sum);
    }
}
