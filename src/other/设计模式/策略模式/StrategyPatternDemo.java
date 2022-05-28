package other.设计模式.策略模式;

/**
 * Description: memory
 * Created by xiaozhenzhen001
 * on 2021/1/5
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {

        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
