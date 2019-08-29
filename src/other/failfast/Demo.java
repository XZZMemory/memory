package other.failfast;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(i);
        }
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread 2开始执行");
                set.add(100);
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Iterator<Integer> iterator = set.iterator();
                System.out.println(iterator.next());
                thread2.start();
                try {
                    System.out.println("线程1被线程2阻塞");
                    thread2.join();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("线程2执行完毕");
                }
                int i = 0;
                while (iterator.hasNext()) {
                    System.out.println(i + "  " + iterator.next());
                    i++;
                }
            }
        });
        thread1.start();
    }
}
