package other.designpatterns.命令模式;


public class CommandSell implements Command {
    private ReceiverStock abcReceiverStock;

    public CommandSell(ReceiverStock abcReceiverStock) {
        this.abcReceiverStock = abcReceiverStock;
    }

    public void execute() {
        abcReceiverStock.sell();
    }
}