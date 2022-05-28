package other.设计模式.单例模式.饿汉式;

/**
 * created by memory
 * on 2019/8/29 19 07
 */
public class Demo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            final int k = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    SingleObject object = SingleObject.getInstance();
                    System.out.println("线程" + k + " toString :" + object.toString() + " hashcode:" + object.hashCode());
                }
            }).start();
        }
    }
}
