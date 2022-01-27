package other.多线程.Synchronized测试;

public class Demo {
    private static Object obj = new Object();

    public static void main(String[] args) {
        testSynchronized();
    }

    public static void testSynchronized1() {
        synchronized (obj) {
            try {
                for (int i = 0; i < 10; ++i) {
                    Thread.sleep(1000);
                    System.out.println(String.format("测试1" + "T " + String.valueOf(i)));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void testSynchronized2() {
        synchronized (obj) {
            try {
                for (int i = 0; i < 10; ++i) {
                    Thread.sleep(1000);
                    System.out.println("测试2" + String.format("T " + String.valueOf(i)));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void testSynchronized() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                testSynchronized1();
                testSynchronized2();
            }
        }).start();
//        for (int i = 0; i < 10; ++i) {
//
//        }
    }

}
