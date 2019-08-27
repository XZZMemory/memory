package algorithm.jd;


import java.util.*;

public class Main2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] data = new int[m][2];
        for (int i = 0; i < data.length; i++) {
            data[i][0] = in.nextInt();
            data[i][1] = in.nextInt();
        }
        in.close();
        int[] rela = new int[n * 2 + 1];
        for (int i = 0; i < data.length; i++) {
            rela[data[i][0]]++;
            rela[data[i][1]]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        int sum = 0;
        while (isEmpty(rela)) {
            int cur = getMax(rela);
            ++sum;
            queue.add(cur);
            for (int i = 0; i < data.length; i++) {
                if (cur <= n) {
                    if (data[i][0] == cur) {
                        rela[data[i][1]]--;
                        rela[data[i][0]]--;
                    }
                } else {
                    if (data[i][1] == cur) {
                        rela[data[i][1]]--;
                        rela[data[i][0]]--;
                    }
                }
            }
        }
        System.out.println(sum);
        while (queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }


    public static boolean isEmpty(int[] data) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int getMax(int[] data) {
        int flag = 1;
        int max = data[1];
        for (int i = 1; i < data.length; i++) {
            if (max < data[i]) {
                flag = i;
                max = data[i];
            }
        }
        return flag;
    }

}
