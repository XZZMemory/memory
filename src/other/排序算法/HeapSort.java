package other.排序算法;


import other.排序算法.util.SortUtils;

import java.util.Arrays;

/**
 * description:memory
 *
 * @author xiaozhenzhen001
 * @date 2022/8/12
 */
public class HeapSort {


    public static void main(String[] args) {
        HeapSort sort = new HeapSort();

        int[] b = {49, 38, 65, 97, 76, 13, 27, 50};
        int[] arr = new int[]{3, 5, 3, 0, 8, 6, 1, 5, 8, 6, 2, 4, 9, 4, 7, 0, 1, 8, 9, 7, 3, 1, 2, 5, 9, 7, 4, 0, 2, 6};

        sort.heapSort(b);
        sort.heapSort(arr);
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(arr));
    }

    public int[] heapSort(int[] data) {
        // 1.先将data数组调整为大根堆
        for (int index = data.length / 2; index >= 0; --index) {
            heapSortCurrent(data, index, data.length - 1);
        }
        // 2.将堆顶（最大值）与最后位置交换并调整堆
        for (int index = data.length - 1; index > 0; --index) {
            SortUtils.exch(data, 0, index);
            heapSortCurrent(data, 0, index - 1);
        }
        return data;
    }

    public void heapSortCurrent(int[] data, int index, int maxIndex) {
        // 左孩子位置
        int leftIndex = (index << 1) + 1;
        // 越界，直接返回
        if (leftIndex > maxIndex) {
            return;
        }
        // 右孩子位置
        int rightIndex = leftIndex + 1;

        // 找左右孩子中的最大值
        int childMaxIndex = (rightIndex <= maxIndex && data[rightIndex] > data[leftIndex]) ? rightIndex : leftIndex;

        // 左右孩子均比当前节点小，则不用调整
        if (data[childMaxIndex] < data[index]) {
            return;
        }
        // 左右孩子比当前节点大，则交换调整
        SortUtils.exch(data, index, childMaxIndex);
        heapSortCurrent(data, childMaxIndex, maxIndex);
    }


}
