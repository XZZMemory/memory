package other.oomconstruct;

/**
 * created by memory
 * on 2019/8/28 21 36
 */
public class StackOOM {
    private int stackLength;

    public void addStackLength() {
        stackLength++;
        addStackLength();
    }

    public static void main(String[] args) throws Throwable {
        StackOOM oom = new StackOOM();
        try {
            oom.addStackLength();
        } catch (Throwable e) {
            System.out.println("stack length:" + oom.stackLength);
            throw e;
        }
    }
}
/*
执行结果：
stack length:19978
Exception in thread "main" java.lang.StackOverflowError
	at other.oomconstruct.StackOOM.addStackLength(StackOOM.java:12)
	at other.oomconstruct.StackOOM.addStackLength(StackOOM.java:12)
 */
