package other.设计模式.责任链模式.test1;

/**
 * Description: memory
 * Created by xiaozhenzhen001
 * on 2021/3/2
 */
public class ChainOfResponsibilityPattern {
    public static void main(String[] args) {
        //组装责任链
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setNext(handler2);
        //提交请求
        handler1.handleRequest("two");
    }
}
