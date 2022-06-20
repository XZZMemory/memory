package other.设计模式.单例模式.使用静态内部类1;

public class Singleton {
    private Singleton() {
    }

    //静态内部类在使用的时候才加载，且只加载一次
    private static class T {
        static {
            System.out.println("执行T的静态代码块");

        }


        private static Singleton t = new Singleton();
    }

    public static Singleton getInstance() {

        return T.t;
    }
}
