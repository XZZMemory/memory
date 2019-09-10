package algorithm.xiaohongshu;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//n个宝物
        int[][] data = new int[n][2];
        for (int i = 0; i < n; i++) {
            data[i][0] = sc.nextInt();
            data[i][1] = sc.nextInt();
        }
        //按照宝物的稀有度排序
        Arrays.sort(data, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        data[0][0] = 1;
        //使用动态规划
        //当前判断的 是i
        int max = 1;
        for (int i = 1; i < data.length; i++) {
            data[i][0] = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (data[i][1] >= data[j][1] && data[j][0] + 1 > data[i][0]) {
                    data[i][0] = data[j][0] + 1;
                    max = data[i][0] > max ? data[i][0] : max;
                    break;
                }
            }
        }
        System.out.println(max);
    }
}
