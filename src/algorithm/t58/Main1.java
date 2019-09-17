package algorithm.t58;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] data = str.split(",");
        int result = 0;
        String lastStr = null;
        for (int i = 0; i < data.length; i++) {
            if (i == 0) {
                ++result;
                lastStr = data[i];
            } else if (!data[i].equals(lastStr)) {
                ++result;
                lastStr = data[i];

            }
        }
        System.out.println(result);
    }

}
