package other.designpatterns.命令模式.eg2;

public class ConcreteCommand1 implements Command {
    private Receiver receiver;

    ConcreteCommand1() {
        receiver = new Receiver();
    }

    @Override
    public void execute() {
        receiver.action1();
    }
}
