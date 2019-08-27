package other.innerClass.staticInnerClass;

public class OuterClass {
    private static String msg = "memory";

    //静态内部类
    public static class NestedStaticClass {
        public void printMsg() {
            System.out.println("message from nested static：" + msg);
        }
    }

    //非静态内部类
    public class InnerClass {
        public void display() {
            System.out.println("message from nested static：" + msg);
        }
    }
}
