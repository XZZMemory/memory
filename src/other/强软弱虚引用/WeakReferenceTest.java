package other.强软弱虚引用;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class WeakReferenceTest {
    public static void main(String[] args) {
        /*弱引用开始：*/
        A a = new A(7);
        WeakReference<A> reference = new WeakReference<>(a);
        System.out.println("gc前的引用队列： " + reference.get());
        System.gc();
        System.out.println("gc后的引用队列： " + reference.get());
    }

    static class A {
        public int a;

        public A(int a) {
            this.a = a;
        }
    }
}
