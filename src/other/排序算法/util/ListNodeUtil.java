package other.排序算法.util;

import other.排序算法.object.ListNode;

import java.util.Objects;

/**
 * @author xiaozhenzhen
 * @Date 2022/3/6
 */
public class ListNodeUtil {


    public static ListNode create(int[] nums) {
        ListNode p = null;
        ListNode header = p;
        for (int i = 0; i < nums.length; i++) {
            ListNode q = new ListNode();
            q.val = nums[i];
            if (p == null) {
                header = q;
                p = q;
            } else {
                p.next = q;
                p = q;
            }
            q.next = null;


        }
        return header;
    }

    public static void print(ListNode head) {
        if (Objects.isNull(head)) {
            return;
        }
        ListNode p = head;
        while (Objects.nonNull(p)) {
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();

    }

    public static void add(ListNode head, ListNode common) {
        ListNode p = head;
        while (p.next != null) {
            p = p.next;
        }
        p.next = common;

    }

}
