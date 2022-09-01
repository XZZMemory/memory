package other.有三个线程让他们按序循环不停的执行;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * created by memory
 * on 2019/1/10 下午7:58
 */
public class ConcurrentPrint1 {

//    public static AtomicInteger counter = new AtomicInteger(100);
    // 只能保证原子性，但阻塞时确实大于1，所以会有个双重判断

    // 共享资源个数都初始为1
    private static Semaphore s1 = new Semaphore(1);
    private static Semaphore s2 = new Semaphore(0);
    private static Semaphore s3 = new Semaphore(0);
    public static volatile int counter = 101;
//    public

    public static void main(String[] args) throws InterruptedException {


        Thread t1 = new Thread(new Runnable() {
            public void run() {
                while (counter > 1) {
                    try {
                        s1.acquire();
                        if (counter > 1) {
                            System.out.print("【A】" + counter);
                            --counter;
                            System.out.println(" end" + counter);
                        }
                        s2.release();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }

                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                while (counter > 1) {
                    try {
                        s2.acquire();
                        if (counter > 1) {

                            System.out.print("【B】" + counter);

                            --counter;
                            System.out.println(" end" + counter);
                        }

                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    s3.release();
                }
            }
        });
        Thread t3 = new Thread(new Runnable() {
            public void run() {
                while (counter > 1) {
                    try {
                        s3.acquire();
                        if (counter > 1) {

                            System.out.print("【C】" + counter);
                            --counter;
                            System.out.println(" end" + counter);
                        }
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    s1.release();
                }
            }
        });
        t1.start();
        t2.start();
        t3.start();
        System.out.println(counter);

    }
}