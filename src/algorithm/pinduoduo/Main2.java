package algorithm.pinduoduo;

import java.util.Scanner;

//移动珍珠，环形，使位置最小。使用动态规划，以什么为中心点，步长最小
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();//长度l
        int n = in.nextInt();//n颗珍珠
        int[] positionArray = new int[n];
        for (int i = 0; i < n; i++) {
            positionArray[i] = in.nextInt();
        }
        int length = move(n, l, positionArray);
        System.out.println(length);
    }

    //以i为中心点的移动距离
    public static int move(int n, int l, int[] position) {
        int length = 0;
        return length;
    }
}
