package algorithm.wangyi;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 4, 5, 0, 6, 0, 0, 7, 8};
        traverse(data);
    }

    public static void traverse(int[] data) {
        if (data == null || data.length < 1) {
            return;
        }
        int level = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < data.length; i++) {
            if (data[i] != 0) {
                if (i <= level * 2) {
                    stack.push(data[i]);
                    System.out.print(data[i] + " ");
                } else {
                    System.out.println();
                    level = i;
                    System.out.print(data[i] + " ");
                    stack.push(0);
                    stack.push(data[i]);
                }
            }
        }
        System.out.println();
        Stack<Integer> secondStack = new Stack<>();
        while (!stack.isEmpty()) {
            int currentData = stack.pop();
            if (currentData == 0) {
                System.out.println();
                while (!secondStack.isEmpty()) {
                    System.out.print(secondStack.pop() + " ");
                }
            } else {
                secondStack.push(currentData);
            }
        }
        System.out.println();
        while (!secondStack.isEmpty()) {
            System.out.print(secondStack.pop() + " ");
        }
    }
}
