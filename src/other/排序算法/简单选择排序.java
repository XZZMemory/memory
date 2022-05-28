package other.排序算法;

/**
 * description:memory
 *
 * @author xiaozhenzhen001
 * @date 2022/5/28
 */
public class 简单选择排序 {


    public static void main(String[] args) {
        int[] data = {1, 3, 9, 5, 4, 2};
        sort(data);
    }
    // 简单选择排序
    public static void sort(int[] data) {
        int minIndex;
        for (int i = 0; i < data.length; i++) {
            minIndex = selectMin(data, i);
            if (minIndex != i) {
                SortUtils.exch(data, i, minIndex);
            }
        }
    }

    // 选出最小元素的下标
    public static int selectMin(int[] data, int start) {
        int minIndex = start;
        for (int i = start + 1; i < data.length; i++) {
            if (data[i] < data[minIndex]) {
                minIndex = i;
            }

        }
        return minIndex;
    }


}
