package other.设计模式.命令模式.eg2;

public class CommandPattern {
    public static void main(String[] args) {
        Command cmd1 = new ConcreteCommand1();
        Invoker invoker = new Invoker();
        invoker.setCommand(cmd1);
        invoker.call();

        System.out.println("命令2 start");
        Command cmd2 = new ConcreteCommand2();
        invoker.setCommand(cmd2);
        invoker.call();
    }
}
