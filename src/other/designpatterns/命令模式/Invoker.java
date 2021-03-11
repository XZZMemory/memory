package other.designpatterns.命令模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令调用类.使用命令对象的入口
 */

public class Invoker {
    private List<Command> commandList = new ArrayList<Command>();

    public void takeOrder(Command command){
        commandList.add(command);
    }

    public void placeOrders(){
        for (Command command : commandList) {
            command.execute();
        }
        commandList.clear();
    }
}
