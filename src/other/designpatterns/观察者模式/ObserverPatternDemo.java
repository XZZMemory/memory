package other.designpatterns.观察者模式;

/**
 * created by memory
 * on 2018/12/27 下午10:56
 */
public class ObserverPatternDemo {


    public static void  binaryToDecimal(int n) {
        String str = "";
        while (n != 0) {
            str = n % 2 + str;
            n = n / 2;
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        binaryToDecimal(15);
//        Subject subject = new Subject();
//
//        new HexObserver(subject);
//        new OctalObserver(subject);
//        new BinaryObserver(subject);
//
//        System.out.println("First state change: 15");
//        subject.setState(15);
//        System.out.println("Second state change: 10");
//        subject.setState(10);
//
}
}
