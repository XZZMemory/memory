package other.innerClass.staticInnerClass;

import java.text.SimpleDateFormat;

/**
 * @author memory
 * @date 2019/4/29
 */
public class Demo {
    static SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd: HH:mm:ss");

    static class Inner {
        private static long time = System.currentTimeMillis();

       /* public Inner() {
            System.out.println("Outer Class b: " + b);
        }*/

        long getTime() {
            return time;
        }

    }

    public static void main(String[] args) {
        Inner inner = new Inner();
        System.out.println(sf.format(inner.getTime()));
        System.out.println("***************************");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Inner inner2 = new Inner();
        System.out.println(sf.format(inner2.getTime()));
    }
}

class Outer {
    int a = 5;
    static int b = 10;

    public Outer() {
    }


}
