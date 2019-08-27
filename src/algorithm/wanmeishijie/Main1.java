package algorithm.wanmeishijie;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String weight = in.nextLine();
        int limit = in.nextInt();
        in.close();
        String[] weightArray = weight.split(" ");
        int[] data = new int[weightArray.length];
        for (int i = 0; i < data.length; i++) {
            data[i] = Integer.valueOf(weightArray[i]);
        }
        Arrays.sort(data);
        int end = data.length - 1;
        int num = 0;
        int start = 0;
        while (start <= end) {
            if (start == end) {
                //说明最后匹配的只有一个人，默认能一个人一只船
                ++num;
                ++start;
            }
            if (data[start] + data[end] > limit) {
                ++num;
                --end;
            } else {
                ++num;
                ++start;
                --end;
            }
        }
        System.out.println(num);
    }
}
