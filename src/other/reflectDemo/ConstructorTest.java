package other.reflectDemo;

import java.lang.reflect.Constructor;

public class ConstructorTest {
    private static final String className = "other.reflectDemo.pojo.Hero";

    public static void main(String[] args) throws Exception {
        /** 加载class对象*/
        Class class1 = Class.forName(className);
        /** 获取这个类的所有公共构造方法*/
        System.out.println("获取这个类的所有公共构造方法");
        Constructor[] array = class1.getConstructors();
        for (Constructor c : array) {
            System.out.println(c);
        }
        /** 获取这个类的所有的构造方法，包括公有、默认、受保护、私有方法*/
        System.out.println("获取这个类的所有的构造方法，包括公有、默认、受保护、私有方法");
        Constructor[] array2 = class1.getDeclaredConstructors();
        for (Constructor c : array2) {
            System.out.println(c);
        }
        //1>、因为是无参的构造方法所以类型是一个null,不写也可以：这里需要的是一个参数的类型，切记是类型
        //2>、返回的是描述这个无参构造函数的类对象。
        System.out.println("获取公有、无参的构造方法");
        Constructor con = class1.getConstructor(null);
        System.out.println(con);
        /**
         * 利用反射机制创建对象
         * 1.获取类对象 Class class = Class.forName("pojo.Hero");
         * 2.获取构造器对象 Constructor con = clazz.getConstructor(形参.class);
         * 3 获取对象 Hero hero =con.newInstance(实参);
         */
        System.out.println("创建实例");
        Object cc = con.newInstance();
        System.out.println("获取私有构造方法");
        Constructor c = class1.getDeclaredConstructor(boolean.class, float.class);

        System.out.println("创建实例");
        c.setAccessible(true);/**暴力访问，强制忽略访问修饰符*/
        Object o = c.newInstance(true, 10);

    }
}
