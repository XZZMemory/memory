package algorithm.beiketwo;

import java.util.Scanner;

public class Main2 {
    /**
     * 第一行输入两个正整数n,k，以空格隔开
     * 长度为n，出现k次，字符串为t
     * 第二行输入长度为n的字符串t
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        //char[] data=new char[n];
        String t = "";
        while (in.nextLine() != "") {
            t = in.nextLine();
            break;
        }
        char[] data = t.toCharArray();
        //abbcab 找首位一样的数据
        //char[] data = "abbcaab".toCharArray();
        int start = 0;
        int flag = 1;
        int similar = 0;
        while (flag < data.length && start < data.length) {
            while (flag < data.length && data[start] != data[flag]) {
                ++flag;
            }
            int i = 0;
            int j = flag;
            boolean isSimilar = true;
            while (j < data.length) {
                //判断后续数据是否一样
                if (data[i] == data[j]) {
                    ++i;
                    ++j;
                } else {
                    isSimilar = false;
                    break;
                }
            }
            if (isSimilar) {
                similar = i;
                break;
            } else flag++;
        }
        String str = t.substring(similar);
        for (int i = 1; i < k; i++) {
            t += str;
        }
        System.out.println(t);
        System.out.println(str);
    }
}
