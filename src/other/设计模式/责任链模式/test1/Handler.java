package other.设计模式.责任链模式.test1;

/**
 * Description: memory
 * Created by xiaozhenzhen001
 * on 2021/3/2
 */
public abstract class Handler {
    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public Handler getNext() {
        return next;
    }

    //处理请求的方法
    public abstract void handleRequest(String request);
}
