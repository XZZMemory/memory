package algorithm.beiketwo;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();//贝壳种类
        long m = in.nextLong();//背包体积
        int[][] data = new int[n][2];//0-数量，1-体积
        for (int i = 0; i < n; i++) {
            data[i][0] = in.nextInt();
            data[i][1] = in.nextInt();
        }
        in.close();
        int sum = 0;//能装多少贝壳
        int i = 0;//当前是哪个贝壳
        while (m > 0 && i < data.length) {
            while (data[i][0] > 0 && data[i][1] < m) {
                --data[i][0];
                m -= data[i][1];
                sum++;
            }
            ++i;
        }
        System.out.println(sum);
    }
}
