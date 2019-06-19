package other.强软弱虚引用;

import java.lang.ref.SoftReference;

/**
 * created by memory
 * on 2019/6/13 下午8:41
 */
public class StrongReferenceTest {
    public static void main(String[] args) {
        MyObject obj = new MyObject();//没有加入任何引用队列，是强引用
        obj = null;//删除强引用
        System.gc();
    }
}

class MyObject {
    private int info;
}
