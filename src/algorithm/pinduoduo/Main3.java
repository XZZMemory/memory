package algorithm.pinduoduo;

import java.util.Scanner;

//长度为n的、和为s的数列有多少个
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long s = in.nextLong();
        System.out.println(result(s, 0, n, 0));
    }

    public static long result(long s, long currentSum, long n, long last) {
        if (n == 0) {
            return 0;
        }
        long times = 0;
        for (long i = last + 1; i <= s - currentSum; i++) {
            currentSum += i;
            if (currentSum == s) {
                if (n == 1) {
                    ++times;
                }
            } else if (currentSum < s) {
                if (n == 2) {
                    if (i <= (s - currentSum - 1)) {
                        times += 1;
                    }
                } else {
                    times += result(s, currentSum, n - 1, i);
                }
            } else {
                return 0;
            }
            currentSum -= i;
        }
        return times;
    }
}
