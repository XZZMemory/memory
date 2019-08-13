package other.reflectDemo;


import other.reflectDemo.pojo.HeroPlus;

import java.lang.reflect.Method;

/**
 * 获取成员方法并使用
 */
public class MethodTest {
    public static void main(String[] args) {
        HeroPlus heroPlus = new HeroPlus();
        try {
            /** 获取名字叫做 setName，参数类型是String 的方法*/
            Method[] methods = heroPlus.getClass().getDeclaredMethods();
            for (Method method : methods) {
                System.out.println(method);
            }
            Method method = heroPlus.getClass().getMethod("setName", String.class);
            /** 对对象heroPlus 调用这个方法*/
            method.invoke(heroPlus, "memory");
            /**使用传统方式调用这个方法*/
            System.out.println("调用setName方法后的值： " + heroPlus.getName());
            System.out.println("使用反射方式调用对象的getName() 方法");
            Method method1 = heroPlus.getClass().getMethod("getName");
            method1.invoke(heroPlus, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
