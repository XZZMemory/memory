package other.reflectDemo;

import other.reflectDemo.pojo.Hero;

import java.lang.reflect.Constructor;

public class ObjectTest {
    public static void main(String[] args) {
        String className = "reflectDemo.pojo.Hero";
        try {
            //获取类对象的第一种方式
            Class pClass1 = Class.forName(className);
            //获取类对象的第二种方式
            Class pClass2 = Hero.class;
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
