package other.designpatterns.单例模式.使用静态内部类1;

import other.designpatterns.单例模式.饿汉式.SingleObject;

public class Demo {
    public static void main(String[] args){
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
