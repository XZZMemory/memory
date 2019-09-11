import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static String process(String num1, String num2) {


        //Please write your code here
        String[] num1Ar = num1.split(" ");
        int[] sumArray = new int[num1Ar.length];
        for (int i = 0; i < sumArray.length; i++) {
            sumArray[i] = Integer.valueOf(num1Ar[i]);
        }
        int money = Integer.valueOf(num2);


        return null;
    }

    private static int dp(int[] sumArray, int des, int current, int sum, int num) {
        for (int i = 0; i < sumArray.length; i++) {
            if (sumArray[i] != 0) {
                int data = get(i);
            }
        }
        return 0;
    }

    private static int get(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 5;
            case 2:
                return 10;
            case 3:
                return 50;
            case 4:
                return 100;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String strValueSequences = sc.nextLine();//每个面值大小
        String strChargeNum = sc.nextLine();// 凑够多少钱

        String sum = process(strValueSequences, strChargeNum);
        System.out.println(sum);
    }
}
