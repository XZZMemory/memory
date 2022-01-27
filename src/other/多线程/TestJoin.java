package other.多线程;

/**
 * description:memory
 *
 * @author xiaozhenzhen001
 * @date 2022/1/26
 */
public class TestJoin {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                System.out.println("thread1 start...");
                try {
                    Thread.sleep(2000L);
                } catch (Exception e) {
                }
                System.out.println("thread1 end...");
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                System.out.println("thread2 start...");
                try {
                    t1.join();
                } catch (Exception e) {
                }
                System.out.println("thread2 end...");
            }
        };
        t1.start();
        t2.start();
    }
}
