package algorithm.bilibili;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//输入一个正数数组，排序，组成的最小数字
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        in.close();
        String[] data = str.split(",");
        Arrays.sort(data, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1 + o2;
                String s2 = o2 + o1;
                return s1.compareTo(s2);
            }
        });
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
        }
    }
}
