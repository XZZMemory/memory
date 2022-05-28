package other.排序算法;

import other.排序算法.util.SortUtils;

//升序
public class 冒泡排序 {
    public static void main(String[] args) {
        int[] data = {1, 3, 9, 5, 4, 2};
        bubbleSort(data);
    }

    public static void bubbleSort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 1; j < data.length - i; j++) {
                if (data[j - 1] > data[j]) {
                    SortUtils.exch(data, j - 1, j);
                }
            }
        }
    }
}
