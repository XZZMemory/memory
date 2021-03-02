package other.designpatterns.责任链模式;

/**
 * Description: memory
 * Created by xiaozhenzhen001
 * on 2021/2/4
 */
public class ErrorLogger extends AbstractLogger {


    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("ERROR: " + message);
    }
}
