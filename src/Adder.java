import java.util.Scanner;

public class Adder {
    private static String add(String num1, String num2) {
        //Please write your code here
        if (num1 == null) {
            return num2;
        } else if (num2 == null) {
            return num1;
        }
        /**
         * 判断小数点
         * 小数点加减
         * 整数加减
         */
        int index1 = 0;
        if (num1.contains(".")) {
            index1 = num1.indexOf(".");
        }
        String indexAfterStr1 = num1.substring(index1 + 1);//小数点后的位置
        String indexBeforeStr1 = num1.substring(0, index1);
        int index2 = 0;
        if (num2.contains(".")) {
            index2 = num2.indexOf(".");
        }
        String indexAfterStr2 = num2.substring(index2 + 1);//小数点后的位置
        String indexBeforeStr2 = num2.substring(0, index2);
        int indexNum = 0;
        //小数点相加
        String sbAfter = "";
        int flag = 0;
        if (index1 < 0 && index2 > 0) {
            sbAfter = indexAfterStr2;
        } else if (index1 > 0 && index2 < 0) {
            sbAfter = indexAfterStr1;
        } else if (index1 < 0 && index2 < 0) {

        } else if (index1 > 0 && index2 > 0) {

            if (index1 > index2) {
                sbAfter = indexAfterStr1.substring(index1 - index2);
                index1 = index2;
            } else if (index1 < index2) {
                sbAfter = indexAfterStr1.substring(index2 - index1);
                index2 = index1;
            }
            --index1;
            --index2;
            while (index1 >= 0 && index2 >= 0) {
                int data1 = indexAfterStr1.charAt(index1) - '0';
                int data2 = indexAfterStr2.charAt(index2) - '0';
                int result = data1 + data2 + flag;
                flag = result / 10;
                sbAfter = String.valueOf(result % 10) + sbAfter;
                index1--;
                index2--;
            }
        }
        //整数相加
        int inde1 = indexBeforeStr1.length() - 1;
        int inde2 = indexBeforeStr2.length() - 1;
        String sbBefore = "";
        while (inde1 >= 0 && inde2 >= 0) {
            int data1 = indexBeforeStr1.charAt(inde1) - '0';
            int data2 = indexBeforeStr2.charAt(inde2) - '0';
            int result = data1 + data2 + flag;
            flag = result / 10;
            sbBefore = String.valueOf(result % 10) + sbBefore;
            inde1--;
            inde2--;
        }
        while (inde1 >= 0) {
            int result = flag + indexAfterStr1.charAt(inde1) - '0';
            flag = result / 10;
            sbBefore = String.valueOf(result % 10) + sbBefore;
        }
        while (inde2 >= 0) {
            int result = flag + indexAfterStr2.charAt(inde2) - '0';
            flag = result / 10;
            sbBefore = String.valueOf(result % 10) + sbBefore;
        }

        if (sbAfter == "") {
            return sbBefore;
        } else {
            while (sbAfter.charAt(sbAfter.length() - 1) == '0') {
                sbAfter = sbAfter.substring(0, sbAfter.length() - 1);
            }
            return sbBefore + "." + sbAfter;
        }

    }


    // please don't modify any code below.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num1 = sc.nextLine();
        String num2 = sc.nextLine();

        String sum = add(num1, num2);
        System.out.println(sum);
    }
}