package other.设计模式.命令模式;


public class CommandBuy implements Command {
    private ReceiverStock abcReceiverStock;

    public CommandBuy(ReceiverStock abcReceiverStock) {
        this.abcReceiverStock = abcReceiverStock;
    }

    public void execute() {
        abcReceiverStock.buy();
    }
}