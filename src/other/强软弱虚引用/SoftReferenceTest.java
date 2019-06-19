package other.强软弱虚引用;

import java.lang.ref.SoftReference;//other.other.强软弱虚引用.强软弱虚引用
import java.lang.ref.WeakReference;

public class SoftReferenceTest {
    public static void main(String[] args) {
        SoftReference<String> softReference = new SoftReference<String>(new String("Hello"));
        /*若只是声明一个强引用，则只需声明，不用加入任何引用队列，若加入引用队列，就不是强引用。
        Phantom 虚引用*/
        System.out.println("GC前的软引用" + softReference.get());
        System.out.println("分配内存块大小");
        byte[] b = new byte[4 * 1024 * 925*40];
        System.gc();
        System.out.println("GC后的软引用" + softReference.get());
    }
}
