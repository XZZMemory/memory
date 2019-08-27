package algorithm.kuaishou;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        short m = in.nextShort();
        int[] data = new int[m];
        for (int i = 0; i < m; i++) {
            data[i] = in.nextInt();
        }
        boolean[] result = new boolean[m];
        for (int i = 0; i < data.length; i++) {
            Set<Integer> set = new HashSet<>();
            set.add(data[i]);
            result[i] = false;
            int sum = transfer(data[i]);
            while (!set.contains(sum)) {
                if (sum == 1) {
                    result[i] = true;
                    break;
                } else {
                    set.add(sum);
                    sum = transfer(sum);
                }
            }
        }
        for (boolean c : result) {
            System.out.println(c);
        }
    }

    public static int transfer(int currentData) {
        int sum = 0;
        while (currentData != 0) {
            sum += Math.pow(currentData % 10, 2);
            currentData = currentData / 10;
        }
        return sum;
    }
}
