package other.annotations;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * created by memory
 * on 2019/8/28 11 40
 */
public class AnnotationsRunner {
    public static void main(String[] args) throws Exception {
        System.out.println("执行自定义注解开始时间：" + new Date());
        Class mycalsss = Test.class;
        Object object = mycalsss.newInstance();
        Method[] ms = object.getClass().getDeclaredMethods();
        for (Method method : ms) {
            //   MyAnnotation mt = method.getAnnotation(MyAnnotation.class);
            boolean flag = method.isAnnotationPresent(MyAnnotation.class);
            System.out.println(method.getName());
            System.out.println(flag);
            if (flag) {
                System.out.println("执行注解函数。。。");
                method.invoke(object, null);
                System.out.println("执行注解函数结束。。。");
            }/*
            if (!flag) {
                method.invoke(object, null);
            }*/
        }
    }
}
