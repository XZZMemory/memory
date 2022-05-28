package other.内部类.anonymousInnerClass;

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
        Person P2 = new Person() {
            @Override
            public void eat() {
                System.out.println("third eating....");
            }
        };
        pp.eat();
    }
}
