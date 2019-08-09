package other.graph;

public class MGraph {
    char[] vexs;
    int[][] edges;
    int vNum, eNum;

    //顶点和边
    public MGraph(char[] vexs, int vNum, int eNum, int[][] edges) {
        this.vexs = vexs;
        this.edges = edges;
        this.vNum = vNum;
        this.eNum = eNum;
    }

    /**
     * public MGraph creatGraph() {
     *         int vNum =7;
     *         String[] vexs=new char[]{'V0'};
     *                 MGraph mGraph = new MGraph()
     *     }
     */
}
