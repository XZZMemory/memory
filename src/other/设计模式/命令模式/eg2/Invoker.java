package other.设计模式.命令模式.eg2;


import java.util.Objects;

//调用者
public class Invoker {

    private Command command;

    public Invoker() {
    }

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call() {
        if (Objects.isNull(command)) {
            System.out.println("没有调用者");
        }
        System.out.println("调用者执行命令command...");
        command.execute();
    }
}
