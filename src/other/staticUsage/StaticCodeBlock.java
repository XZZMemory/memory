package other.staticUsage;

public class StaticCodeBlock {
    public static int value = 0;

    static {
        System.out.println("执行静态代码块");
    }

    public StaticCodeBlock() {
        System.out.println("执行构造函数");
    }
}
