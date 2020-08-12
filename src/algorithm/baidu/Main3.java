package algorithm.baidu;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][2];//点权
        for (int i = 0; i < n; i++) {
            a[i][0] = i;// 0-节点，1-权值
            a[i][1] = in.nextInt();
        }
        //获取连通的权值
        Map<Integer, Set<Integer>> lines = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            int node1 = in.nextInt();
            int node2 = in.nextInt();
            int j = 0;
            if (lines.containsKey(node1)) {
                lines.get(node1).add(node2);
            } else {
                Set<Integer> set = new HashSet<>();
                set.add(node2);
                lines.put(node1, set);
            }
        }
        //a: 0-节点，1-点权
        Arrays.sort(a, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        //使用动态规划
        /**/
        int[][] result = new int[4][n ];
        int maxLength = 0;
        for (int j = 0; j < result[0].length; j++) {
            result[0][j] = a[j][0];//0-节点
            result[1][j] = 0;//1-是否连通
            result[2][j] = 0;//2-连通的路径长度
            result[3][j] = a[j][1];//权值
        }
        result[1][1] = 1;
        for (int j = 1; j < result[0].length; j++) {
            // 求最大子序列长度
            int currentNode = result[j][0];
            for (int k = 0; k < j; k++) {
                // 节点连通，且权值小，则通
                int node = result[k][0];
                // 连通、有线、权值小
                if (result[k][1] == 1 && lines.get(node).contains(currentNode) && result[k][3] < result[currentNode][3]) {
                    result[k][2] = result[j][2] > result[k][2] + 1 ? result[j][2] : result[k][2] + 1;
                    maxLength = maxLength > result[k][2] ? maxLength : result[k][2];
                }

            }
        }
    }
}
