package beike;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();//人数
        int[] weightArray = new int[n];//体重
        for (int i = 0; i < n; i++) {
            weightArray[i] = in.nextInt();
        }
        int times = 0;//能比赛多少次
        Arrays.sort(weightArray);
        for (int i = 0; i < weightArray.length; i++) {
            for (int j = i + 1; j < weightArray.length; j++) {
                if (weightArray[i] >= weightArray[j] * 0.9) {
                    ++times;
                } else {
                    j = weightArray.length;
                }
            }
        }
        /*
        for (int i = 0; i < weightArray.length; i++) {
            for (int j = i + 1; j < weightArray.length; j++) {
                //能否比赛
                int weight1 = weightArray[i];
                int weight2 = weightArray[j];
                float weightMin = Math.min(weight1, weight2);
                float weightMax = Math.max(weight1, weight2);
                if (weightMin >= (weightMax * 0.9)) {
                    ++times;
                }
            }
        }
         */
        System.out.println(times);
    }
}
