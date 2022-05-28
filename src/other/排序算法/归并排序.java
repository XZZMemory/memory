package other.排序算法;

import other.排序算法.util.SortUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * created by memory
 * on 2018/12/25 下午4:36
 */
public class 归并排序 {


    public static void main(String[] args) {
        int[] arr = {11, 44, 11, 23, 67, 88, 65, 34, 48, 9, 12};
        int[] tmp = new int[arr.length];    //新建一个临时数组存放
        mergeSort(arr, 0, arr.length - 1, tmp);
        SortUtils.print(arr);

    }


    /**
     * 归并排序: 分而治之 https://blog.csdn.net/m0_38056893/article/details/79461901
     *
     * @param arr
     * @param low
     * @param high
     * @param tmp
     */
    public static void mergeSort(int[] arr, int low, int high, int[] tmp) {
        if (low >= high) {
            return;
        }
        int middle = (low + high) / 2;
        mergeSort(arr, low, middle, tmp);
        mergeSort(arr, middle + 1, high, tmp);
        //左右合并
        merge(arr, low, middle, high, tmp);

    }

    // 类似两个有序数组合并
    public static void merge(int[] arr, int low, int mid, int high, int[] tmp) {
        int i = low;
        int j = mid + 1;
        int index = i;
        // 把较小的数先移到新数组中
        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                tmp[index++] = arr[i++];
            } else {
                tmp[index++] = arr[j++];
            }
        }
        // 把左边剩余的数移入数组
        while (i <= mid) {
            tmp[index++] = arr[i++];
        }

        // 把右边边剩余的数移入数组
        while (j <= high) {
            tmp[index++] = arr[j++];
        }
        index--;
        // 把新数组中的数覆盖nums数组
        while (index >= low) {
            arr[index] = tmp[index];
            --index;
        }

    }


}
