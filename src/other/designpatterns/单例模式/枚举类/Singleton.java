package other.designpatterns.单例模式.枚举类;

public enum Singleton {
    INSTANCE(1, "myKey"),
    ;

    private int resource;
    private String key;

    Singleton(int resource, String key) {
        this.resource = resource;
        this.key = key;
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
