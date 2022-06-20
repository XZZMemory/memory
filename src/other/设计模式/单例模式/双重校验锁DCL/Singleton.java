package other.设计模式.单例模式.双重校验锁DCL;

public class Singleton {
    private static volatile Singleton instance = null;

    private Singleton() {
    }


    static {
        System.out.println("执行静态代码块");
    }
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

//package other.设计模式.单例模式.懒汉式;
//
//public class Singleton {
//    private static Singleton instance;
//
//    public synchronized static Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }
//}


