package other.设计模式.单例模式.second;

import object.MyObject;

/**
 * description:memory
 *
 * @author xiaozhenzhen001
 * @date 2022/6/20
 */
public class Lazy {
    private static MyObject singleton = null;

    public static synchronized MyObject getInstance() {
        if (singleton == null) {
            System.out.println("执行初始化");
            singleton = new MyObject();
        }
        return singleton;
    }
}
