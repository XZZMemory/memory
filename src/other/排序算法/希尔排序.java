package other.排序算法;

import other.排序算法.util.SortUtils;

/**
 * 希尔排序是插入排序的一种，也称缩小增量排序，非稳定算法
 * 希尔排序把记录按照增量排序分组，对每组使用直接插入算法排序
 * 随着增量减少，每组包含的关键词越来越多，当增量减至1，整个文件分成一组，算法终止
 */
public class 希尔排序 {
    public static void main(String[] args) {
        int[] data = {1, 3, 2, 9, 5, 4, 2};
        SortUtils.print("before", data);
        shellSort(data);
        SortUtils.print("after", data);
    }

    public static void shellSort(int data[]) {
        // 步长
        int incre = data.length;
        while (incre >= 1) {
            incre = incre / 2;
            for (int i = 0; i < incre; i++) {
                // 对每个子序列使用直接插入排序
                for (int j = i + incre; j < data.length; j += incre) {
                    int k = j;
                    while (k >= incre && data[k - incre] > data[k]) {
                        SortUtils.exch(data, k - incre, k);
                        k -= incre;
                    }
                }
            }

        }
    }




}
