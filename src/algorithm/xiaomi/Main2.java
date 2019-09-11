package algorithm.xiaomi;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main2 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static String solution(String[] input) {
        int length = input[0].split(" ").length;
        int[][] data = new int[input.length][length];
        for (int i = 0; i < data.length; i++) {
            String[] current = input[i].split(" ");
            for (int j = 0; j < data[0].length; j++) {
                data[i][j] = Integer.valueOf(current[j]);

            }
        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 1; j < data[i].length; j++) {
                int s1 = data[i][j];
                int s2 = data[i][j - 1];
                if (s1 != 0 && (s1 == s2)) {
                    data[i][j - 1] = s1 *2 ;
                    data[i][j] = 0;
                }

            }
            int start = 0;
            int end = 0;
            while (end < data[i].length) {
                if (data[i][end] != 0) {
                    data[i][start] = data[i][end];
                    data[i][end] = 0;
                    ++start;
                }
                ++end;
            }
            while (start < data[i].length) {
                data[i][start] = 0;
                ++start;
            }
        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        return null;


    }

    /******************************结束写代码******************************/


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String res;

        int _input_size = 0;
        _input_size = Integer.parseInt(in.nextLine().trim());
        String[] _input = new String[_input_size];
        String _input_item;
        for (int _input_i = 0; _input_i < _input_size; _input_i++) {
            try {
                _input_item = in.nextLine();
            } catch (Exception e) {
                _input_item = null;
            }
            _input[_input_i] = _input_item;
        }
        res = solution(_input);
    }
}

