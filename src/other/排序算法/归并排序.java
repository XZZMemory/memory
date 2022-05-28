package other.排序算法;

import other.排序算法.object.ListNode;
import other.排序算法.util.ListNodeUtil;
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
        ListNode head = ListNodeUtil.create(new int[]{4, 2, 1, 3});
        ListNodeUtil.print(head);
        ListNodeUtil.print(sortList(head));

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


    /**
     * ****************** 以下链表的归并
     */

    public static ListNode sortList(ListNode head) {
        // 求链表长度
        int length = 0;
        ListNode p = head;

        while (p != null) {
            length++;
            p = p.next;
        }
        ListNode newHead = new ListNode();

        newHead.next = head;

        for (int subLength = 1; subLength < length; subLength = subLength << 1) {  // 2,4,1,3
            ListNodeUtil.print(newHead.next);
            if (subLength >= 2) {
                int i = 0;
            }
            ListNode curNode = newHead.next;
            ListNode pre = newHead;

            while (curNode != null) {
                int curLength = 1;
                ListNode head1 = curNode;

                while (curLength < subLength && curNode.next != null) {
                    curNode = curNode.next;
                    curLength++;
                }

                ListNode head2 = curNode.next;
                // 给断开
                curNode.next = null;
                curNode = head2;

                curLength = 1;
                while (curLength < subLength && curNode != null && curNode.next != null) {
                    curNode = curNode.next;
                    curLength++;
                }

                if (curNode != null) {
                    ListNode newNode = curNode.next;
                    curNode.next = null;
                    curNode = newNode;
                }

                ListNode mergeNode = merge(head1, head2);
                pre.next = mergeNode;
                while (pre.next != null) {
                    pre = pre.next;
                }
            }

        }
        return newHead.next;
    }

    public static ListNode merge(ListNode head1, ListNode head2) {
        ListNode head = new ListNode();
        ListNode p = head;

        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                p.next = head1;
                head1 = head1.next;
            } else {
                p.next = head2;
                head2 = head2.next;
            }
            p = p.next;
        }
        if (head1 != null) {
            p.next = head1;
        }
        if (head2 != null) {
            p.next = head2;
        }
        return head.next;
    }


}
