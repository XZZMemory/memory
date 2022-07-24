package algorithm.huawei;

import java.util.Scanner;

/**
 * description:memory
 *
 * @author xiaozhenzhen001
 * @date 2022/7/24
 */
public class Demo1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 怎么拿到字符串？？？
        String s = in.next();
        in.close();
        int res = 0;
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '-') {
                int curNum = 0;
                ++i;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    curNum = curNum * 10 + (s.charAt(i) - '0');
                    ++i;
                }
                res -= curNum;
            } else if (Character.isDigit(s.charAt(i))) {
                res += (s.charAt(i++) - '0');
            } else {
                ++i;
            }

        }
        System.out.println(res);
    }
}
