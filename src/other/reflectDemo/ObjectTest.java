package other.reflectDemo;

import other.reflectDemo.pojo.Hero;

import java.lang.reflect.Constructor;

public class ObjectTest {
    /**
     * 三种方式中，常用第一种，
     * 第二种需要导入类的包，依赖太强，不导包就抛编译错误。
     * 第三种对象都有了还要反射干什么。
     * 一般都第一种，一个字符串可以传入也可写在配置文件中等多种方法。
     */
    public static void main(String[] args) {
        String className = "other.reflectDemo.pojo.Hero";
        try {
            //获取类对象的第一种方式
            Class pClass1 = Class.forName(className);
            //获取类对象的第二种方式
            Class pClass2 = Hero.class;
            System.out.println(pClass2.getName());
            //获取类对象的第三种方式
            Class pClass3 = new Hero().getClass();
            System.out.println(pClass1 == pClass2);//输出true
            System.out.println(pClass1 == pClass3);//输出true
            Constructor[] array = pClass1.getConstructors();
            for (Constructor c : array) {
                System.out.println(c);
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}