package other.designpatterns.命令模式.eg2;

public class ConcreteCommand2 implements Command {
    private Receiver receiver;

    ConcreteCommand2() {
        receiver = new Receiver();
    }

    @Override
    public void execute() {
        receiver.action2();
    }
}
