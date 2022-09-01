package other.排序算法;

import other.排序算法.util.SortUtils;

import java.util.Arrays;

/**
 * description:memory
 *
 * @author xiaozhenzhen001
 * @date 2022/8/12
 */
public class Demo {


    class Solution {
        // 归并排序
        public int[] sortArray(int[] data) {
            mergeSort(data, 0, data.length - 1, new int[data.length]);
            return data;
        }

        public void mergeSort(int[] data, int left, int right, int[] temp) {
            // 只有一个元素
            if (left >= right) {
                return;
            }
            int middle = left + (right - left) / 2;
            // 左有序、右有序
            mergeSort(data, left, middle, temp);
            mergeSort(data, middle + 1, right, temp);
            // 合并左右
            mergeSortArray(data, left, middle, right, temp);
        }

        // 合并两个有序数组  [left, middle], [middle+1, right]
        public void mergeSortArray(int[] data, int left, int middle, int right, int[] temp) {
            int leftIndex = left, rightIndex = middle + 1, index = left;
            while (leftIndex <= middle && rightIndex <= right) {
                if (data[leftIndex] < data[rightIndex]) {
                    temp[index++] = data[leftIndex++];
                } else {
                    temp[index++] = data[rightIndex++];
                }
            }
            while (leftIndex <= middle) {
                temp[index++] = data[leftIndex++];
            }
            while (rightIndex <= right) {
                temp[index++] = data[rightIndex++];
            }
            for (index = left; index <= right; index++) {
                data[index] = temp[index];
            }
        }
    }

}
