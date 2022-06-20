package other.设计模式.单例模式.second;

import object.MyObject;

/**
 * description:memory
 *
 * @author xiaozhenzhen001
 * @date 2022/6/20
 */
public enum MyEnum {
    SINGLETON_INSTANCE(new MyObject());
    private MyObject object;

    private MyEnum(MyObject object) {
        this.object = object;

    }


    public MyObject getObject() {
        return this.object;

    }

}
