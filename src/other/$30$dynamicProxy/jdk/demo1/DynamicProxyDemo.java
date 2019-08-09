package other.$30$dynamicProxy.jdk.demo1;

import java.lang.reflect.Proxy;

public class DynamicProxyDemo {
    public static void main(String[] args) {
        JavaDeveloper javaDeveloper = new JavaDeveloper("memory");
        /**
         *     public static Object newProxyInstance(ClassLoader loader,
         *                                           Class<?>[] interfaces,
         *  ，                                         InvocationHandler h)
         *（类加载器，实现的接口，触发/调用管理器）
         * 动态代理工作的基本模式就是将自己的方法功能的实现交给 InvocationHandler角色，
         * 外界对Proxy角色中的每一个方法的调用，Proxy角色都会交给InvocationHandler来处理，
         * 而InvocationHandler则调用具体对象角色的方法。
         * 在这种模式之中：代理Proxy 和RealSubject 应该实现相同的功能，这一点相当重要。（我这里说的功能，可以理解为某个类的public方法）
         *
         * 在面向对象的编程之中，如果我们想要约定Proxy 和RealSubject可以实现相同的功能，有两种方式：
         *
         * 　　a.一个比较直观的方式，就是定义一个功能接口，然后让Proxy 和RealSubject来实现这个接口。
         *
         *     　b.还有比较隐晦的方式，就是通过继承。因为如果Proxy 继承自RealSubject，这样Proxy则拥有了RealSubject的功能，
         *
         * 　　　Proxy还可以通过重写RealSubject中的方法，来实现多态。
         *
         * 其中JDK中提供的创建动态代理的机制，是以a 这种思路设计的，*/
        System.out.println("当前类实现的接口");
        Class<?>[] c = javaDeveloper.getClass().getInterfaces();//继承的接口
        for (Object cx : c) {
            System.out.println(cx);
        }
        System.out.println("*******************");
        Object memoryProxy = Proxy.newProxyInstance(
                javaDeveloper.getClass().getClassLoader(),
                javaDeveloper.getClass().getInterfaces(),
                ((proxy, method, args1)
                        -> {
                    System.out.println("method:" + method);
                    if (method.getName().equals("code")) {
                        System.out.println(javaDeveloper.getName() + " is praying before " + method.getName());
                        method.invoke(javaDeveloper);
                    } else if (method.getName().equals("debug")) {
                        System.out.println(javaDeveloper.getName() + " is praying before " + method.getName());
                        method.invoke(javaDeveloper);
                    } else if (method.getName().equals("cook")) {
                        System.out.println(javaDeveloper.getName() + " is praying before " + method.getName());
                        method.invoke(javaDeveloper);
                    }
                    return null;
                }));
        Developer developer = (Developer) memoryProxy;
        developer.code();
        developer.debug();
        ((Developer2) memoryProxy).cook();
    }
}
