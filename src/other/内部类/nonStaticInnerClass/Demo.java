package other.内部类.nonStaticInnerClass;

/**
 * @author memory
 * @date 2019/4/29
 */

/**
 * 原文地址： https://www.cnblogs.com/dolphin0520/p/3811445.html
 * 在Java中，可以将一个类定义在另一个类里面或者一个方法里面，这样的类称为内部类。
 * 广泛意义上的内部类一般来说包括这四种：成员内部类、局部内部类、匿名内部类和静态内部类。
 */
public class Demo {
    public static void main(String[] args){
        /** 创建内部类的第一种方法，通过外部类对象来创建*/
        Circle circle=new Circle(6);
        Circle.Draw draw1=circle.new Draw();//必须通过外部类来创建内部类
        draw1.drawShape();
        /** 创建内部类的第二种方法*/
        Circle.Draw draw2=circle.getDrawInstance();
        draw2.drawShape();
    }
}
