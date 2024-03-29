package other.排序算法;

import other.排序算法.util.SortUtils;

public class 直接插入排序 {
    public static void main(String[] args) {
        int[] data = {1, 3, 2, 9, 5, 4, 2};
        SortUtils.print(data);
        sort(data);
        SortUtils.print(data);
    }

    public static void sort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            // 如果已经比有序的大了，说明是顺序的，不需要调整
            int j = i;
            while (j > 0 && data[j] < data[j - 1]) {
                SortUtils.exch(data, j, j - 1);
                j--;

            }
        }
    }

}
