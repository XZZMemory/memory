package other.innerClass.staticInnerClass;

public class OuterClassDemo {
    public static void main(String[] args) {
        OuterClass.NestedStaticClass printer = new OuterClass.NestedStaticClass();
        printer.printMsg();//调用静态内部类的非静态方法
        //为了创建非静态内部类，我们先需要外部类的实例
        OuterClass outer = new OuterClass();
//        outerClass.InnerClass inne = outerClass.new InnerClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();//调用非静态内部类的非静态方法

    }
}
