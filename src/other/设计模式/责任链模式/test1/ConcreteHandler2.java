package other.设计模式.责任链模式.test1;

/**
 * Description: memory
 * Created by xiaozhenzhen001
 * on 2021/3/2
 */
public class ConcreteHandler2  extends Handler{
    public void handleRequest(String request) {
        if (request.equals("two")) {
            System.out.println("具体处理者2负责处理该请求！");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(request);
            } else {
                System.out.println("没有人处理该请求！");
            }
        }
    }
}
