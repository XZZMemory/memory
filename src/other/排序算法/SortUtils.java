package other.排序算法;

/**
 * description:memory
 *
 * @author xiaozhenzhen001
 * @date 2022/5/28
 */
public class SortUtils {
    public static void exch(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}
