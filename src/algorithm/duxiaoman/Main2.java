package algorithm.duxiaoman;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//题目的意思是，坐标有正有负，所以使用二维矩阵要慎重，但二维矩阵也不好考虑，障碍物坐标是不确定的，坐标轴是无限大的，总不能建一个无限大的数组吧
//以前碰到类似问题，直接用一个二维数组， 然后求解，但是这个不行，emmm
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int n = in.nextInt();
        Set<Obstacle> set = new HashSet<>();
        while (n > 0) {
            int xx = in.nextInt();
            int yy = in.nextInt();
            set.add(new Obstacle(xx, yy));
        }
        int min = Integer.MAX_VALUE;


    }
}

class Obstacle {
    private int x;
    private int y;

    public Obstacle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public int hashCode() {
        return x + y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        if (!(obj instanceof Obstacle)) {
            return false;
        }
        Obstacle other = (Obstacle) obj;
        if (other.getX() == this.getX() && other.getY() == this.getY()) {
            return true;
        }
        return false;
    }
}
