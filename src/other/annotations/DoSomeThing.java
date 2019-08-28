package other.annotations;

import java.util.Date;

/**
 * created by memory
 * on 2019/8/28 11 39
 */
public class DoSomeThing {

    public void test() {
        System.out.println("执行自定义注解");
        System.out.println("执行自定义注解结束时间：" + new Date());
    }
}
