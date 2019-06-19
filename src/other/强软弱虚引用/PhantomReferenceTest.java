package other.强软弱虚引用;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/**
 * created by memory
 * on 2019/6/13 下午8:54
 */
/*虚引用与软引用和弱引用的一个区别在于：虚引用必须和引用队列 ReferenceQueue 联合使用*/
public class PhantomReferenceTest {
    public static void main(String[] args) {
        MyObject1 myObject1 = new MyObject1();
        ReferenceQueue queue = new ReferenceQueue();
        PhantomReference pr = new PhantomReference(myObject1, queue);
        System.gc();
        System.out.println(pr.get());
        System.out.println(queue.poll());
    }
}

class MyObject1 {
    private int info;
}
