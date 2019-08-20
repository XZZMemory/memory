package other.ioc.factory;

import other.ioc.Banana;
import other.ioc.object.Apple;
import other.ioc.object.Orange;

/**
 * spring Ioc ： 工厂模式+反射机制
 * https://blog.csdn.net/fuzhongmin05/article/details/61614873
 */
public class FactoryTest {
    public static void main(String[] args) throws Exception {
        Apple apple = BeanFactory.newInstance("Apple");
        apple.color();
        Orange orange = BeanFactory.newInstance("Orange");
        orange.born();
        Banana banana = BeanFactory.newInstance("Banana");
        banana.eat();
    }
}

