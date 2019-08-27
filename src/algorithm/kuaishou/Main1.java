package algorithm.kuaishou;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = Integer.parseInt(s);
        String[] data = new String[count];
        for (int i = 0; i < count; i++) {
            data[i] = sc.nextLine();
        }
        for (String currentString : data) {
            String[] verArray = currentString.split(" ");
            String[] ver1 = verArray[0].split("\\.");
            String[] ver2 = verArray[1].split("\\.");
            for (int i = 0; i < ver1.length || i < ver2.length; i++) {
                int value1 = i < ver1.length ? Integer.valueOf(ver1[i]) : 0;
                int value2 = i < ver2.length ? Integer.valueOf(ver2[i]) : 0;
                if (value1 < value2) {
                    System.out.println(true);
                    break;
                } else if (value1 > value2) {
                    System.out.println(false);
                    break;
                } else if ((i ) == Math.max(ver2.length, ver1.length)-1) {
                    System.out.println(false);
                }
            }

        }
    }
}
