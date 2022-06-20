package other.设计模式.单例模式.second;

import object.MyObject;

/**
 * description:memory
 *
 * @author xiaozhenzhen001
 * @date 2022/6/20
 */
public class Hungry {
    public static MyObject object = new MyObject();

    public static MyObject getInstance() {
        return object;
    }
}
