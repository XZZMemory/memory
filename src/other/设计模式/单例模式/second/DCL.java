package other.设计模式.单例模式.second;

import object.MyObject;

/**
 * description:memory
 *
 * @author xiaozhenzhen001
 * @date 2022/6/20
 */
public class DCL {
    private volatile static MyObject object = null;

    public static MyObject getInstance() {
        if (object == null) {
            synchronized (DCL.class) {
                object = new MyObject();
            }
        }
        return object;
    }
}
