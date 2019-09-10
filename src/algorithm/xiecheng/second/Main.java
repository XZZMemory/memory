package algorithm.xiecheng.second;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static String resolve(String expr) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        int count = 0;
        for (char c : expr.toCharArray()) {
            if (c == '(') {
                ++count;
                stack.push(c);
            } else if (c == ')') {
                --count;
                char data;
                while (!stack.isEmpty() && (data = stack.pop()) != '(') {
                    queue.add(data);
                }
                while (!queue.isEmpty()) {
                    stack.add(queue.poll());
                }
            } else {
                stack.push(c);
            }
        }
        if (count != 0) {
            return null;
        } else {
            StringBuilder sb = new StringBuilder("");
            int i = 0;
            int length = stack.isEmpty() ? 0 : stack.size();
            while (i < length) {
                char data = stack.elementAt(i);
                sb.append(data);
                i++;
            }
            return sb.toString();
        }
    }

    /******************************结束写代码******************************/


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String res;

        String _expr;
        try {
            _expr = in.nextLine();
        } catch (Exception e) {
            _expr = null;
        }

        res = resolve(_expr);
        System.out.println(res);
    }
}

