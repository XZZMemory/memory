package other.designpatterns.单例模式.懒汉式;

public class Singleton {
    private static Singleton instance;

    public synchronized static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
