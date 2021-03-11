package other.designpatterns.命令模式;

public class CommandPatternDemo {
    public static void main(String[] args) {
        ReceiverStock abcReceiverStock = new ReceiverStock();

        CommandBuy commandBuy = new CommandBuy(abcReceiverStock);
        CommandSell commandSell = new CommandSell(abcReceiverStock);

        // 使用 Invoker 类来接受并执行命令。
        Invoker invoker = new Invoker();
        invoker.takeOrder(commandBuy);
        invoker.takeOrder(commandSell);

        invoker.placeOrders();
    }
}
