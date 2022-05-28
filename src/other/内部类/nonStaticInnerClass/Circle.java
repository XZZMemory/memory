package other.内部类.nonStaticInnerClass;

/**
 * @author memory
 * @date 2019/4/29
 */

/**
 * 　成员内部类是最普通的内部类，它的定义为位于另一个类的内部
 * 成员内部类可以无条件访问外部类的所有成员属性和成员方法（包括private成员和静态成员）。
 */
public class Circle {
    private double radius;
    public static int count=1;
    public Circle(double radius){
        this.radius =radius;
        getDrawInstance().drawShape();//必须先创建内部类的对象，再进行访问
    }
    public Draw getDrawInstance(){
        return new Draw();
    }
    class Draw{//other.内部类
        public void drawShape(){
            System.out.println("drawShape: "+radius+" count: "+count);
        }

    }
}
