package other.排序算法;

import other.gc.MyObject;
import other.排序算法.object.ListNode;
import other.排序算法.util.SortUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * created by memory
 * on 2018/12/25 下午2:32
 */
public class Main {
    public static void main(String[] args) {
//        int[] data = {2, 4, 7, 2, 1};
//        SortUtils.print("before", data);
//        List<ListNode> lists = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            lists.add(new ListNode(i));
//        }
//
//        lists.forEach(
//                node -> {
//                    System.out.println(node.val);
//                }
//        );
//        System.out.println("**********");
//        Map<Integer, ListNode> map = new LinkedHashMap<>();
//        lists.forEach(oldNode -> {
//            ListNode newNode = new ListNode(oldNode.val);
//            map.put(oldNode.val, newNode);
//        });
//        List<ListNode> newLists = map.values().stream().collect(Collectors.toList());
//        newLists.forEach(
//                node -> {
//                    System.out.println(node.val);
//                }
//        );
//
//
//        headSort(data);
//        SortUtils.print("after", data);


    }


    /**
     * 堆排序
     */

    public static void headSort(int[] list) {
        for (int i = (list.length - 1) / 2; i > 0; --i) {
            headAdjust(list, list.length - 1, i);
        }
        //排序，将最大的节点放在堆尾，然后从根节点重新调整
        for (int i = list.length - 1; i > 0; --i) {
            int temp = list[0];
            list[0] = list[i];
            list[i] = temp;
            headAdjust(list, list.length - 1, 0);
        }
        //构造初始堆,从第一个非叶子节点开始调整,左右孩子节点中较大的交换到父节点中
    }

    public static void headAdjust(int[] list, int len, int i) {
        int k = i, index = 2 * k + 1, temp = list[i];
        while (index < len) {
            if (index + 1 < len) {
                if (list[index + 1] > list[index]) {
                    index = index + 1;
                }
            }
            if (list[index] > temp) {
                list[k] = list[index];
                k = index;
                index = 2 * k + 1;
            }
        }
        list[k] = temp;
    }

    public static void mergeSort(int[] list, int start, int end, int[] temp) {

        if (start >= end) {
            return;
        }
        int middle = start + (end - start) / 2;
        mergeSort(list, start, middle, temp);
        mergeSort(list, middle + 1, end, temp);
        mergeData(list, start, middle, end, temp);
    }

    public static void mergeData(int[] data, int start, int middle, int end, int[] temp) {

        if (start >= end) {
            return;
        }
        // 合并两个有序数组
        int i = start, j = middle + 1;
        int index = i;
        while (i <= start && j <= end) {
            if (data[i] <= data[j]) {
                temp[index++] = data[i++];
            } else {
                temp[index++] = data[j++];
            }
        }
        while (i <= start) {
            temp[index++] = data[i++];
        }
        while (j <= end) {
            temp[index++] = data[j++];
        }
        index = start;
        while (index <= end) {
            data[index] = temp[index];
            ++index;
        }
    }
}

