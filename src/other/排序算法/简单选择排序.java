package other.排序算法;

import other.排序算法.util.SortUtils;

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

    /**
     * 简单选择排序
     * 在要排序的一组数中，选出最小（或者最大）的一个数与第1个位置的数交换；
     * 然后在剩下的数当中再找最小（或者最大）的与第2个位置的数交换，
     * 依次类推，直到第n-1个元素（倒数第二个数）和第n个元素（最后一个数）比较为止。
     */
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
