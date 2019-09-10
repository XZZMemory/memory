package other.innerClass.anonymousInnerClass;

/**
 * @author memory
 * @date 2019/4/29
 */
public class Demo {
    public static void main(String[] args) {
        new MyObject().printInfo();
        //内部匿名类
        Person p = new Person() {
            @Override
            public void eat() {
                System.out.println("first eating...");
            }
        };
        p.eat();

        Person pp = new Person() {
            @Override
            public void eat() {
                System.out.println("second eating...");
            }
        };
        pp.eat();
    }
}