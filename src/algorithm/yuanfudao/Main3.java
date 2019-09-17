package algorithm.yuanfudao;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//这个题目条件多。。。。。
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();// 记录数量
        int m = in.nextInt();// 班级数量

    }
}

class Union implements Comparable<Union> {
    String className;
    int teacherId;
    int studentNum;
    Set<Integer> student = new HashSet<>();//学生id；
    Set<Interval> teacherInterval = new HashSet<>();// 老师上课时间
    float teacherTime;//老师上课课时
    float studentTime;//学生有效出勤分钟数

    @Override
    public int compareTo(Union o) {
        if (this.studentTime / this.teacherTime / this.studentNum > o.studentTime / o.teacherTime / o.studentTime) {
            return 1;
        } else if (this.studentTime / this.teacherTime / this.studentNum < o.studentTime / o.teacherTime / o.studentTime) {

            return -1;
        } else {
            return this.className.compareTo(o.className);
        }
    }
}

class Interval {
    int start, end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int unionTime(int start, int end) {
        //无交集
        if (this.start > end || this.end < start) {
            return 0;
        }
        int i = this.start > start ? this.start : start;
        int j = this.end < end ? this.end : end;
        return j - i;

    }

    public int getTime() {
        return this.end - this.start;
    }
}