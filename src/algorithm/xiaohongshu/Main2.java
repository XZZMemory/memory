package algorithm.xiaohongshu;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer("");
        char[] result = new char[str.length()];
        int resultIndex = -1;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                ++count;
                ++i;
                while (count != 0 && i < str.length()) {
                    if (str.charAt(i) == '(') {
                        ++count;
                    } else if (str.charAt(i) == ')') {
                        --count;
                    }
                    ++i;
                }
            } else if (str.charAt(i) == '<') {
                resultIndex = resultIndex > -1 ? resultIndex - 1 : -1;
            } else {
                result[++resultIndex] = str.charAt(i);
            }
        }
        for (int i = 0; i <= resultIndex; i++) {
            System.out.print(result[i]);
        }
    }
}
