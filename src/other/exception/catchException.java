package other.exception;

import java.util.Vector;

public class catchException {
    public static void main(String[] args) {
        Vector<Integer> vector = ExceptionTest2();
        System.out.println("data:" + vector.elementAt(0));
    }

    //try-catch捕获异常
    public static void ExceptionTest1() {
        int[] c = {1, 2};
        int bx = c[10];

        try {
            int[] a = {1, 2};
            int b = a[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("错误类型是：" + e);
        }
    }

    //finally
    public static Vector<Integer> ExceptionTest2() {
        Vector<Integer> vector;
        int[] data = {1, 2};
        //System.out.println(data[11]);
        try {
            System.out.println(data[10]);
            vector = new Vector<>();
            vector.add(1);
            return vector;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("错误信息是：" + e);
        } finally {
            System.out.print("执行finally语句部分：");
            vector = new Vector<>();
            vector.add(4);
            data[0] = 11;
            System.out.println("data数组0位置存储的数据是：" + data[0]);
            //return vector;
        }
        System.out.println("执行最后");
        return vector;
    }
}
