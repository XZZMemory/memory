package algorithm;

import java.util.ArrayList;
import java.util.List;

//约瑟夫环问题
public class LastRemaining {
    public static void main(String[] args) {
        lastRemaining(5, 2);
    }

    //使用链表
    public static int lastRemaining(int n, int m) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i + 1);
        }
        /**
         * n=5  m=2
         * 1 2 3 4 5
         * 0 1 2 3 4
         */
        int index = -1;
        while (list.size() > 1) {
            index = (index + m) % list.size();
            System.out.print(index + " ");
            System.out.print(list.remove(index) + " ");//index
            --index;//下一个计算从 index'-1的位置开始
        }

        System.out.println();
        System.out.println(list.get(0));
        return list.get(0);
    }

    /**
     * 圆环长度是n的解可以看成长度是 n-1的解再加上报数的长度m
     *
     * @param n
     * @param m
     * @return
     */
    public static int lastRemainingRec(int n, int m) {
        Integer.valueOf(9);
        if (n == 0) {
            return -1;//特殊输入的处理
        }
        if (n == 1) {
            return 0;//递归返回条件
        }
        return (lastRemainingRec(n - 1, m) + m) % n;
    }
}
