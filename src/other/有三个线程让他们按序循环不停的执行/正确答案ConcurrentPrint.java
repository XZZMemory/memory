package other.有三个线程让他们按序循环不停的执行;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * created by memory
 * on 2019/1/10 下午7:58
 */
public class 正确答案ConcurrentPrint {
    public static int counter = 100;

    public static class MyThread extends Thread {
        Semaphore waited;
        Semaphore notify;
        String name;

        public MyThread(String name, Semaphore waited, Semaphore notify) {
            this.name = name;
            this.waited = waited;
            this.notify = notify;
        }

        @Override
        public void run() {
            while (counter > 0) {
                try {
                    // acquire表示获取许可，拿不到则已知阻塞
                    waited.acquire();
                    if (counter > 0) {
                        System.out.println(name + " " + counter);
                    }
                    --counter;
                    // release表示释放许可
                    notify.release();
                } catch (Exception e) {
                    System.out.println("Thread name Error! " + e);

                }
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        Semaphore s1 = new Semaphore(1);
        Semaphore s2 = new Semaphore(0);
        Semaphore s3 = new Semaphore(0);
        // 初始化时只有线程A可拿到锁(因为许可数量是1,可以拿到许可；s2、s3许可数量是0没有许可拿)
        MyThread threadA = new MyThread("A", s1, s2);
        MyThread threadB = new MyThread("B", s2, s3);
        MyThread threadC = new MyThread("C", s3, s1);

        threadA.start();
        threadB.start();
        threadC.start();
        System.out.println(counter);

    }
}