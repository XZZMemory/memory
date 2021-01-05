package other.designpatterns.策略模式;

/**
 * Description: memory
 * Created by xiaozhenzhen001
 * on 2021/1/5
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 执行
     *
     * @param num1
     * @param num2
     * @return
     */
    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
