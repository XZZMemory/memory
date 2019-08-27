package other.设计模式.单例模式.懒加载3;

public class Singleton {
    private static Singleton instance;

    public synchronized static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
