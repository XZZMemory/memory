package other.强软弱虚引用.软引用;

import java.lang.ref.SoftReference;

/**
 * created by memory
 * on 2019/6/13 下午9:04
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("开始");
        A a = new A();
        SoftReference<A> sr = new SoftReference<A>(a);
        System.out.println(sr.get());
        a = null;/*假设此时内存不足，对象a，从内存中拿出*/
        System.gc();
        if (sr != null) {
            a = sr.get();
            System.out.println("从软引用队列中获取对象：" + a);
        } else {
            a = new A();
            sr = new SoftReference<A>(a);
            System.out.println("重新创建对象，并加入软引用队列中" + a);
        }
        System.out.println("结束");
    }
}

class A {
    int[] a;

    public A() {
        a = new int[100000000];
    }
}