package other.ioc.factory;

import other.ioc.Banana;
import other.ioc.object.Apple;
import other.ioc.object.Orange;

public class FactoryTest {
    public static void main(String[] args) throws Exception {
        Apple apple = Factory.newInstance("Apple");
        apple.color();
        Orange orange = Factory.newInstance("Orange");
        orange.born();
        Banana banana = Factory.newInstance("Banana");
        banana.eat();
    }
}
