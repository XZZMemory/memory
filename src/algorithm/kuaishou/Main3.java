package algorithm.kuaishou;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstString = in.nextLine();
        String secondString = in.nextLine();
        String[] firstArray = firstString.split(" ");
        String[] secondArray = secondString.split(" ");
        int length1 = firstArray.length;
        int length2 = secondArray.length;
        String[] result = new String[length1 + length2];
        int index = 0;
        int indexFirst = 0;
        int indexSecond = 0;
        while (indexFirst < length1 && indexSecond < length2) {
            int sum = 1;
            while (indexFirst < length1 && sum <= 4) {
                result[index] = firstArray[indexFirst];
                ++index;
                ++indexFirst;
                ++sum;
            }
            result[index] = secondArray[indexSecond];
            ++index;
            ++indexSecond;
        }
        while (indexFirst < length1) {
            result[index] = firstArray[indexFirst];
            ++index;
            ++indexFirst;
        }
        while (indexSecond < length2) {
            result[index] = secondArray[indexSecond];
            ++index;
            ++indexSecond;
        }
        for (String c : result) {
            System.out.print(c + " ");
        }
    }
}
