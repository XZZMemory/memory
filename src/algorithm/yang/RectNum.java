package algorithm.yang;

import java.util.Scanner;

public class RectNum {
    public static void main(String[] args) {
        //半径N。输出面积/方块数
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        System.out.println(getNum(n));
    }

    public static int getNum(int n) {
        int width = n - 1;
        int area = 0;
        while (width >= 1) {
            int height = (int) Math.sqrt(n * n - (n - 1) * (n - 1));
            if (height * width > area) {
                area = height * width;
            }
            --width;
        }
        if (area > 0) {
            return area * 4;
        }
        return 0;
    }
}
