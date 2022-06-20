package other.设计模式.单例模式.双重校验锁DCL;

import other.设计模式.单例模式.饿汉式.SingleObject;

public class Test {
    public static void main(String[] args) {
        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的，构造函数访问修饰符是private，只有当前类能调用
        //SingleObject object = new SingleObject();
        /* Object对象的方法：
         * 1. hashCode()将对象在内存中的地址转换为int值
         * 2. equals(Object obj) 其他某个对象是否与此对象的地址相等
         * 3. toString() 返回该对象的字符串表示  “类名+@+hashcode”值
         *   public String toString() {
                 return getClass().getName() + "@" + Integer.toHexString(hashCode());
             }

          */

        for (int i = 0; i < 10; i++) {
            final int k = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Singleton object = Singleton.getInstance();
                    System.out.println("线程" + k + " toString :" + object.toString() + " hashcode:" + object.hashCode());
                }
            }).start();
        }
    }
}
