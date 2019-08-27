package other.innerClass.staticInnerClass;

/**
 * @author memory
 * @date 2019/4/29
 */
public class Demo {
    public static void main(String[] args){
        Outer.Inner inner=new Outer.Inner();
    }
}
class Outer{
    int a=5;
    static int b=10;
    public Outer(){}
    static class Inner{
        public Inner(){
            System.out.println("Outer Class b: "+b);
        }

    }
}
