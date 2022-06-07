package other.排序算法;

/**
 * 原理：分治+递归
 * 复杂度：O(nlgn) - O(n^2) - O(1)[平均 - 最好 - 最坏
 * 栈空间：0(lgn) - O(n)
 */
public class 快排 {
    public static void main(String[] args) {

        int[] data = {2, 4, 7, 2, 1};
        quickSort(data, 0, data.length - 1);

    }

    public static void quickSort(int[] data, int start, int end) {
        if (start >= end) {
            return;
        }
        // 排序
        int middle = singleQuickSort(data, start, end);
        // 左面快排
        quickSort(data, start, middle - 1);
        // 右面快排
        quickSort(data, middle + 1, end);


    }

    public static int singleQuickSort(int[] data, int start, int end) {
        int temp = data[start];
        while (start < end) {
            while (start < end && data[end] >= temp) {
                --end;
            }
            if (start < end) {
                data[start] = data[end];
            }
            while (start < end && data[start] <= temp) {
                ++start;
            }
            if (start < end) {
                data[end] = data[start];
            }
        }
        // start=end
        data[start] = temp;
        return start;

    }
}
