package other.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * description:memory
 *
 * @author xiaozhenzhen001
 * @date 2022/5/20
 */
public class Demo {
    public static void main(String[] args) {
        AtomicInteger integer1 = new AtomicInteger(0);
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    integer1.addAndGet(1);
                    System.out.println("线程1 " + integer1.get());

                }

            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    integer1.addAndGet(1);
                    System.out.println("线程@1 " + integer1.get());
                }

            }
        });
        thread1.start();
        thread2.start();
        try {

            thread1.join();
            thread2.join();
        } catch (Exception e) {
            System.out.println("执行结束 异常!" + integer1.get());

        }
//        System.out.println("执行结束" + integer.get());
        System.out.println("执行结束" + integer1.get());

    }
}
