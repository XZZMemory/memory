package other.排序算法.util;

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

    public static void print(int[] data) {
        print(data, 0, data.length - 1);
    }

    public static void print(int[] data, int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }


    public static void print(String prefix, int[] data) {
        System.out.print(prefix + " ");
        print(data);
        System.out.println();
    }

    public static void print(String prefix, int[] data, int start, int end) {
        System.out.print(prefix + " ");
        print(data, start, end);
        System.out.println();
    }
}

