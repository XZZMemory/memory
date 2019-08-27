package other.设计模式.单例模式.双重校验锁DCL2;

public class Test {
    public static void main(String[] args) {
        System.out.println("1: "+Singleton.getInstance());
        System.out.println("2: "+Singleton.getInstance());
        System.out.println("3: "+Singleton.getInstance());
    }
}
