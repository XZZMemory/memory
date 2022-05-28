package other.设计模式.模板模式;

/**
 * description:memory
 *
 * @author xiaozhenzhen001
 * @date 2022/5/13
 */
public abstract class AbstractClass {
    //模板方法
    public void templateMethod() {
        specificMethod();
        abstractMethod1();
        abstractMethod2();
    }

    //具体方法
    public void specificMethod() {
        System.out.println("抽象类中的具体方法被调用...");
    }

    //抽象方法1
    public abstract void abstractMethod1();

    //抽象方法2
    public abstract void abstractMethod2();
}
