package other.exception;

import java.util.Vector;

public class catchException {
    public static void main(String[] args) {
//        Vector<Integer> vector = ExceptionTest2();
//        for (Integer v : vector) {
//            System.out.println("vector:" + v);
//        }
//        System.out.println("data:" + vector.elementAt(0));
        int f = ExceptionTest1();
        System.out.println("test: " + f);
    }

    //try-catch捕获异常
    public static int ExceptionTest1() {
        int[] c = {1, 2};
        int i = 1;
        System.out.println("原始数值：" + i);
        try {
            ++i;
            int[] a = {1, 2};
            int b = a[10];
            return i;
        } catch (ArrayIndexOutOfBoundsException e) {
            i += 2;
            System.out.println("执行加2操作之后： " + i);
            System.out.println("错误类型是：" + e);
            return i;
        } finally {
            System.out.println("执行加3操作之前： " + i);
            i += 3;
            System.out.println("执行加3后操作之后： " + i);
        }
    }

    //finally
    public static Vector<Integer> ExceptionTest2() {
        Vector<Integer> vector;
        vector = new Vector<>();

        int[] data = {1, 2};
        //System.out.println(data[11]);            vector = new Vector<>();

        try {
            vector.add(1);
            System.out.println(data[10]);
            return vector;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("错误信息是：" + e);
        } finally {
            System.out.print("执行finally语句部分：");
            vector.add(4);
            System.out.println("data数组0位置存储的数据是：" + data[0]);
            //return vector;
        }
        System.out.println("执行最后");
        return vector;
    }
}
