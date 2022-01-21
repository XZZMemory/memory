package other.designpatterns.观察者模式;

/**
 * created by memory
 * on 2018/12/27 下午10:54
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
