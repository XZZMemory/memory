package algorithm.xiecheng;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /*请完成下面这个函数，实现题目要求的功能,不带头节点
     ******************************开始写代码******************************/
    static ListNode partition(ListNode head, int m) {
        ListNode p = head;
        ListNode bigHead = null;
        ListNode pBig = null;
        ListNode smallHead = null;
        ListNode pSmall = null;
        ListNode next = null;
        while (p != null) {
            next = p.next;
            if (p.val <= m) {
                if (smallHead == null) {
                    smallHead = p;
                    pSmall = p;
                } else {
                    pSmall.next = p;
                    pSmall = pSmall.next;
                }
            } else {
                if (bigHead == null) {
                    bigHead = p;
                    pBig = p;
                } else {
                    pBig.next = p;
                    pBig = pBig.next;
                }
            }
            p.next = null;
            p = next;
        }
        if (pSmall != null) {
            pSmall.next = bigHead;
            return smallHead;
        } else {
            return bigHead;
        }

    }

    /******************************结束写代码******************************/


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ListNode head = null;
        ListNode node = null;
        int m = Integer.valueOf(in.nextLine());
        String str = in.nextLine();
        String[] array = str.split(" ");
        int i = 0;
        while (i < array.length) {
            int v = Integer.valueOf(array[i]);
            if (head == null) {
                node = new ListNode(v);
                head = node;
            } else {
                node.next = new ListNode(v);
                node = node.next;
            }
            ++i;
        }
        head = partition(head, m);
        if (head != null) {
            System.out.print(head.val);
            head = head.next;
            while (head != null) {
                System.out.print(",");
                System.out.print(head.val);
                head = head.next;
            }
        }
        System.out.println();
    }
}

