package other.oomconstruct;

import java.util.ArrayList;
import java.util.List;

/**
 * created by memory
 * on 2019/8/28 21 40
 */
/*方法区溢出 */
    /*String.intern()是一个Native方法，它的作用是：如果字符串常量池中已经包含了一个等于该String对象的字符串，
    则返回这个String对象，否则，将此String对象包含的字符串添加到常量池中，并返回这个字符串的String对象的引用。如下面代码：
     执行结果：
     ception in thread "main" java.lang.OutOfMemoryError: Java heap space
	at java.lang.Integer.toString(Integer.java:403)
	at java.lang.String.valueOf(String.java:3099)
	at other.oomconstruct.MethodAreaOOM.main(MethodAreaOOM.java:15)
     */
public class MethodAreaOOM {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (true) {
            list.add(String.valueOf(i++).intern());
        }
    }

}
