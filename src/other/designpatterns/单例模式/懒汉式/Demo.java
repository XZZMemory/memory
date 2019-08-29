package other.designpatterns.单例模式.懒汉式;

import other.designpatterns.单例模式.饿汉式.SingleObject;

/**
 * created by memory
 * on 2019/8/29 19 24
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
