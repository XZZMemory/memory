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

//        sort.heapSort(b);
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
        for (; (index << 1) + 1 <= maxIndex; ) {
            int lChildIndex = (index << 1) + 1;
            int rChildIndex = (index << 1) + 2;
            int maxChildIndex = rChildIndex <= maxIndex && data[rChildIndex] > data[lChildIndex] ? rChildIndex : lChildIndex;
            if (data[maxChildIndex] < data[index]) {
                break;
            }
            swap(data, index, maxChildIndex);
            index = maxChildIndex;


        }
    }


    private void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }


}
