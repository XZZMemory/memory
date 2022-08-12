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
        Demo sort = new Demo();

        int[] b = {49, 38, 65, 97, 76, 13, 27, 50};

        sort.heapSort(b);
        System.out.println(Arrays.toString(b));
    }

    public int[] heapSort(int[] data) {
        // 1.先将data数组调整为大根堆
        for (int index = data.length / 2; index >= 0; --index) {
            heapAdjust(data, index, data.length - 1);
        }
        // 2.将堆顶（最大值）与最后位置交换并调整堆
        for (int index = data.length - 1; index > 0; --index) {
            SortUtils.exch(data, 0, index);
            heapAdjust(data, 0, index - 1);
        }
        return data;
    }

    public void heapAdjust(int[] data, int index, int maxIndex) {
        // 左孩子位置
        int leftChildIndex = (index << 1) + 1;
        // 越界，直接返回
        if (leftChildIndex > maxIndex) {
            return;
        }
        // 右孩子位置
        int rightChildIndex = leftChildIndex + 1;

        // 找左右孩子中的最大值
        int childMaxIndex = (rightChildIndex <= maxIndex && data[rightChildIndex] > data[leftChildIndex]) ?
                rightChildIndex : leftChildIndex;

        // 左右孩子均比当前节点小，则不用调整
        if (data[childMaxIndex] < data[index]) {
            return;
        }
        // 左右孩子比当前节点大，则交换调整
        SortUtils.exch(data, index, childMaxIndex);
        heapAdjust(data, childMaxIndex, maxIndex);
    }


}
