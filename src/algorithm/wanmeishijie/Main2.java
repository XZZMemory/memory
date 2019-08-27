package algorithm.wanmeishijie;

import java.util.LinkedList;
import java.util.Queue;

public class Main2 {
    //最短路径问题
    public static void main(String[] args) {
        int[][] graph = {{0, 1, 12, -1, -1, -1}
                , {-1, 0, 9, 3, -1, -1},
                {-1, -1, 0, -1, 5, -1},
                {-1, -1, 4, 0, 13, 15},
                {-1, -1, -1, -1, 0, 4},
                {-1, -1, -1, -1, -1, 0}};

        find(graph);
    }

    static int[] find(int[][] graph) {
        int[] result = new int[graph.length];
        boolean[] isVisited = new boolean[graph.length];
        isVisited[0] = true;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < result.length; i++) {
            if (graph[0][i] != -1) {
                queue.add(graph[0][i]);
                result[i] = graph[0][i];
            } else {
                result[i] = Integer.MAX_VALUE;
            }
        }
        while (queue.isEmpty()) {
            int i = queue.poll();//当前遍历的节点
            isVisited[i] = true;
            //当前节点i
            for (int j = 0; j < graph[i].length; j++) {
                if (j == i) {
                    continue;
                }
                if (graph[i][j] != -1) {
                    if (result[j] > result[i] + graph[i][j]) {
                        result[j] = result[i] + graph[i][j];
                        queue.add(j);//
                    }
                }
            }

        }
        return result;
    }
}