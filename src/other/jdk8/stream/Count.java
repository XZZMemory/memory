package other.jdk8.stream;

import java.util.List;

/**
 * created by memory
 * on 2019/8/30 12 14
 */
/*计数是一个 最终操作，返回Stream中元素的个数，返回值类型是 long*/
public class Count {
    public static void main(String[] args) {
        List<String> stringList = Utils.getStringList();
        //测试 Count (计数)操作
        long startsWithB =
                stringList
                        .stream()
                        .filter((s) -> s.startsWith("b"))
                        .count();
        System.out.println(startsWithB);    // 3
    }
}
