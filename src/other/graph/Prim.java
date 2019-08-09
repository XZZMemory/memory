package other.graph;

//最小生成树，使各边上个的权值之和最小。贪心算法
public class Prim {
    public static final int MAXCOST = Integer.MAX_VALUE;

    public void prim(MGraph graph) {
        int[] lowCost = new int[graph.vNum];
        int[] closeVex = new int [graph.vNum];//U,是否被访问
        for (int i = 0; i < graph.vNum; i++) {
            lowCost[i] = graph.edges[0][i];
            closeVex[i] = 1;
        }
        lowCost[0] = 0;
        closeVex[0] = 0;
        //寻找当前权值最小边，连接的顶点
        for (int i = 1; i < graph.vNum; i++) {
            int minCost = MAXCOST;
            int k = 1;
            for (int j = 1; j < graph.vNum; j++) {
                if (lowCost[j] != 0 && lowCost[j] < minCost) {
                    minCost = lowCost[j];
                    k = j;//记录权值最小的边的连接点
                }
            }
            lowCost[k] = 0;
            for (int j = 1; j < graph.vNum; j++) {
                if (graph.edges[k][j] < lowCost[j]) {
                    lowCost[j] = graph.edges[k][j];
                    closeVex[j] = k + 1;
                }
            }
        }
    }
}
