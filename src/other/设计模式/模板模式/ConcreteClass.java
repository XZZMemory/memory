package other.设计模式.模板模式;

/**
 * description:memory
 *
 * @author xiaozhenzhen001
 * @date 2022/5/13
 */
public class ConcreteClass extends AbstractClass {
    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");

    }

    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");


    }
}
