package algorithm.didi;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int total = in.nextInt();
        int cost = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }
        /*思路：创建一个二维数组，存储结果，使用动态规划，从小到大，判断组成的对，最后再通过判断剩余元素的值，是否满足花费的要求*/
        int max = 0;
        int maxWithoutCost = 0;
        int[][] result = new int[n][n];
        for (int indexA = 0; indexA < n; indexA++) {
            int currentMaxWithoutCost = 0;
            int indexB = 0;
            for (; indexB <= indexA; indexB++) {
                if (a[indexA] == b[indexA]) {
                    result[indexA][indexB] = maxWithoutCost + 1;
                    currentMaxWithoutCost = currentMaxWithoutCost > result[indexA][indexB] ? currentMaxWithoutCost : result[indexA][indexB];
                }
            }
            indexB = indexA;
            for (int i = 0; i <= indexA; i++) {
                if (a[indexA] == b[indexB]) {
                    result[indexA][indexB] = maxWithoutCost + 1;
                    currentMaxWithoutCost = currentMaxWithoutCost > result[indexA][indexB] ? currentMaxWithoutCost : result[indexA][indexB];
                }
            }
            maxWithoutCost = currentMaxWithoutCost;
        }
        //遍历result数组，找到满足条件的元素
        for (int i = result.length; i >= 0; i--) {
            for (int indexA = i; indexA >= 0; indexA--) {

            }
        }

    }

}
