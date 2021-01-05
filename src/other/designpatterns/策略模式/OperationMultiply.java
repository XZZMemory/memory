package other.designpatterns.策略模式;

/**
 * Description: 策略模式乘法
 * Created by xiaozhenzhen001
 * on 2021/1/5
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
