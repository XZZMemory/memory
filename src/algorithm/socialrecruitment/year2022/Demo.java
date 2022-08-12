package algorithm.socialrecruitment.year2022;

import java.util.Stack;

/**
 * description:memory
 *
 * @author xiaozhenzhen001
 * @date 2022/7/26
 */
public class Demo {
    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println(demo.transfer("(i(u(wa)e)h)"));
        System.out.println(demo.transfer("a(bcdefghijkl(mno)p)q"));

    }

    // 只包含英文小写字母和左右小括号
    public String transfer(String str) {
        if (str.length() == 0) {
            return "";
        }
        // 碰到字母，不处理
        char[] chars = str.toCharArray();
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                // 碰到左括号，记录左括号位置（使用栈 stack）
                stack.push(i);
            } else if (chars[i] == ')') {
                // 碰到右括号（下标为i），反转（stack.pop()  和当前i）
                swap(chars, stack.pop(), i);
            }
        }
        StringBuffer res = new StringBuffer();
        for (char c : chars) {
            if (Character.isAlphabetic(c)) {
                res.append(c);
            }
        }
        return res.toString();

    }

    public void swap(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            ++start;
            --end;
        }
    }
}
