import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = in.nextInt();
        }
        Arrays.sort(data);
        while (q > 0) {
            int x = in.nextInt();
            //>=x的均减一，并输出有多少个数字
            int times = 0;
            for (int i = data.length - 1; i >= 0; i--) {
                if (data[i] >= x) {
                    data[i]--;
                    times++;
                } else {
                    break;
                }
            }
            System.out.println(times);
            q--;
        }
        in.close();
    }
}
