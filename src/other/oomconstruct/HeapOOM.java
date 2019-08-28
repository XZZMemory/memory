package other.oomconstruct;

import java.util.ArrayList;
import java.util.List;

/**
 * created by memory
 * on 2019/8/28 20 58
 */
public class HeapOOM {

    static class OOMError {
    }

    public static void main(String[] args) {
        List<OOMError> list = new ArrayList<OOMError>();
        while (true) {
            list.add(new OOMError());
        }
    }
}
/*\
执行结果：
E:\Java\jdk1.8.0_111\bin\java.exe "-javaagent:E:\IntelliJ IDEA 2019.1.3\lib\idea_rt.jar=62051:E:\IntelliJ IDEA 2019.1.3\bin" -Dfile.encoding=UTF-8 -classpath E:\Java\jdk1.8.0_111\jre\lib\charsets.jar;E:\Java\jdk1.8.0_111\jre\lib\deploy.jar;E:\Java\jdk1.8.0_111\jre\lib\ext\access-bridge-64.jar;E:\Java\jdk1.8.0_111\jre\lib\ext\cldrdata.jar;E:\Java\jdk1.8.0_111\jre\lib\ext\dnsns.jar;E:\Java\jdk1.8.0_111\jre\lib\ext\jaccess.jar;E:\Java\jdk1.8.0_111\jre\lib\ext\jfxrt.jar;E:\Java\jdk1.8.0_111\jre\lib\ext\localedata.jar;E:\Java\jdk1.8.0_111\jre\lib\ext\nashorn.jar;E:\Java\jdk1.8.0_111\jre\lib\ext\sunec.jar;E:\Java\jdk1.8.0_111\jre\lib\ext\sunjce_provider.jar;E:\Java\jdk1.8.0_111\jre\lib\ext\sunmscapi.jar;E:\Java\jdk1.8.0_111\jre\lib\ext\sunpkcs11.jar;E:\Java\jdk1.8.0_111\jre\lib\ext\zipfs.jar;E:\Java\jdk1.8.0_111\jre\lib\javaws.jar;E:\Java\jdk1.8.0_111\jre\lib\jce.jar;E:\Java\jdk1.8.0_111\jre\lib\jfr.jar;E:\Java\jdk1.8.0_111\jre\lib\jfxswt.jar;E:\Java\jdk1.8.0_111\jre\lib\jsse.jar;E:\Java\jdk1.8.0_111\jre\lib\management-agent.jar;E:\Java\jdk1.8.0_111\jre\lib\plugin.jar;E:\Java\jdk1.8.0_111\jre\lib\resources.jar;E:\Java\jdk1.8.0_111\jre\lib\rt.jar;E:\content\IdeaProjects\memory\out\production\memory other.oomconstruct.HeapOOM
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
	at java.util.Arrays.copyOf(Arrays.java:3210)
	at java.util.Arrays.copyOf(Arrays.java:3181)
	at java.util.ArrayList.grow(ArrayList.java:261)
	at java.util.ArrayList.ensureExplicitCapacity(ArrayList.java:235)
	at java.util.ArrayList.ensureCapacityInternal(ArrayList.java:227)
	at java.util.ArrayList.add(ArrayList.java:458)
	at other.oomconstruct.HeapOOM.main(HeapOOM.java:18)

Process finished with exit code 1*/
