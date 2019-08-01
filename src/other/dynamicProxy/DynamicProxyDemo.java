package other.dynamicProxy;

import java.lang.reflect.Proxy;

public class DynamicProxyDemo {
    public static void main(String[] args) {
        JavaDeveloper javaDeveloper = new JavaDeveloper("memory");
        /**
         *     public static Object newProxyInstance(ClassLoader loader,
         *                                           Class<?>[] interfaces,
         *                                           InvocationHandler h)*/
        Class<?>[] c = javaDeveloper.getClass().getInterfaces();
        for (Object cx : c) {
            System.out.println(cx);
        }
        System.out.println("*******************");
        Developer2 memoryProxy = (Developer2) Proxy.newProxyInstance(
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
                    }else if (method.getName().equals("cook")){
                        System.out.println(javaDeveloper.getName() + " is praying before " + method.getName());
                        method.invoke(javaDeveloper);
                    }
                    return null;
                }));
        memoryProxy.cook();
    }
}
