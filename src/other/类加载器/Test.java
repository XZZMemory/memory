package other.类加载器;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * created by memory
 * on 2018/12/25 下午10:05
 */
public class Test {


    public Test() {
        System.out.println("CloneDemo.class的类加载器是：" + this.getClass().getClassLoader().toString());
    }


}
