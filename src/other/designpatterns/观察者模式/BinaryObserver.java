package other.designpatterns.观察者模式;

/**
 * created by memory
 * on 2018/12/27 下午10:54
 */
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
