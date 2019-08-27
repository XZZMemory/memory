package algorithm.bilibili;

import java.util.Scanner;

//反转单词书顺序
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char[] data = reverseSentence(str);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
        }
    }

    public static char[] reverseSentence(String str) {
        char[] data = str.toCharArray();
        if (data == null) {
            return null;
        }
        int length = data.length;
        reverse(data, 0, length - 1);
        int start = 0;
        int end = 0;
        while (end < length) {
            while ((end < length && data[end] != ' ')) {
                ++end;
            }
            if (end <= data.length) {
                reverse(data, start, end - 1);
                ++end;
                start = end;
            }
        }
        return data;
    }

    //实际需要反转的位置 start、end
    public static void reverse(char[] data, int start, int end) {
        while (start < end) {
            char temp = data[start];
            data[start] = data[end];
            data[end] = temp;
            ++start;
            --end;
        }
    }
}
