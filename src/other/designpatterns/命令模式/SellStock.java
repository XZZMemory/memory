package other.designpatterns.命令模式;

/**
 * Description: memory
 * Created by xiaozhenzhen001
 * on 2021/3/2
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}