package other.designpatterns.工厂模式;

/**
 * created by memory
 * on 2019/1/24 上午1:21
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println(this.getClass()+"Inside Circle::draw() method.");
    }
}
