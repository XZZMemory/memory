package algorithm.duxiaoman;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int[] ai = new int[n + 1];
        boolean[] visited = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            ai[i] = in.nextInt();
            visited[i] = false;
        }
        /**
         Set<Integer> set = new HashSet<>();
         findMin(ai, a, b, c, 1, n, 0, set, visited);
         Iterator<Integer> iterator = set.iterator();
         int min = Integer.MAX_VALUE;
         while (iterator.hasNext()) {
         min = iterator.next() < min ? iterator.next() : min;
         }
         */
        //递归，不合适，考虑用数组
        int[][] dp=new int[n+1][n+1];


    }

    /*当前位置再current，最终要到达的位置n,当前已花费费用cost,set存储所有的 结果集合
     * 考虑建个访问数组，也不对，并没有访问次数限制，考虑用数组*/
    public static void findMin(int[] ai, int a, int b, int c, int current, int n, int cost, Set<Integer> set, boolean[] visited) {
        if (current == n) {
            set.add(cost + a);
            return;
        }
        if (!visited[ai[current]] && ai[current] != n) {
            findMin(ai, a, b, c, ai[current], n, cost + a, set, visited);
        }
        if (ai[current] > 1) {
            ai[current]--;
            findMin(ai, a, b, c, current, n, cost + b, set, visited);
        }
        ai[current]++;
        if (ai[current] < n) {
            ai[current]++;
            findMin(ai, a, b, c, current, n, cost + c, set, visited);
        }
        ai[current]--;
    }
}
