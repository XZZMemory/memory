package other.设计模式.责任链模式;

/**
 * Description: memory
 * Created by xiaozhenzhen001
 * on 2021/2/4
 */
public class InfoLogger extends  AbstractLogger {
    public InfoLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("INFO: " + message);
    }
}
