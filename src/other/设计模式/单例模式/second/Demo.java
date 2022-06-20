package other.设计模式.单例模式.second;

import object.MyObject;
import other.设计模式.单例模式.second.Lazy;

/**
 * description:memory
 *
 * @author xiaozhenzhen001
 * @date 2022/6/20
 */
public class Demo {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            final int k = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    MyObject object = Lazy.getInstance();
                    System.out.println("1.使用懒汉式 线程" + k + " toString :" + object.toString() + " hashcode:" + object.hashCode());

                }

            }).start();
        }

        for (int i = 0; i < 10; i++) {
            final int k = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    MyObject object = DCL.getInstance();
                    System.out.println("2.使用DCL 线程" + k + " toString :" + object.toString() + " hashcode:" + object.hashCode());

                }

            }).start();
        }

        for (int i = 0; i < 10; i++) {
            final int k = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    MyObject object = Hungry.getInstance();
                    System.out.println("4.使用饿汉式 线程" + k + " toString :" + object.toString() + " hashcode:" + object.hashCode());

                }

            }).start();
        }



        for (int i = 0; i < 10; i++) {
            final int k = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    MyObject object = MyEnum.SINGLETON_INSTANCE.getObject();
                    System.out.println("5.使用枚举类 线程" + k + " toString :" + object.toString() + " hashcode:" + object.hashCode());

                }

            }).start();
        }
    }
}
