package other.多线程.调用start方法和调用run方法的区别;

/**
 * 调用start方法和run方法的区别，Thread.start()方法会开启多线程，线程执行run(）函数中的任务
 * Thread.run()方法，不会开启多线程，跟调用普通方法没有什么区别。
 */
public class Test {
    public static void main(String[] args) {
//      Thread(Runnable target) 分配新的 Thread 对象。
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + "进入Runner1运行状态——————————" + i);
                }
            }
        };
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + "进入Runner2运行状态——————————" + i);
                }
            }
        };

        thread1.start();
        thread2.start();
        /**普通方法，未开启多线程*/
//        thread1.run();
//        thread2.run();
    }
}

class RunnerImplements1 implements Runnable { // 实现了Runnable接口，jdk就知道这个类是一个线程

    @Override
    public void run() {

    }
}

class RunnerImplements2 implements Runnable { // 实现了Runnable接口，jdk就知道这个类是一个线程
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "进入Runner2运行状态==========" + i);
        }
    }
}

