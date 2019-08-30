package other.jdk8.stream;

import java.util.List;

/**
 * created by memory
 * on 2019/8/28 22 28
 */
/*("ddd2")("aaa2")("bbb1")("aaa1")("bbb3")("ccc")("bbb2");("ddd1")*/
public class Filter {
    public static void main(String[] args) {
        List<String> stringList = Utils.getStringList();
        // 测试 Filter(过滤)
        stringList.stream()
                .filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);//aaa2 aaa1
        System.out.println(Integer.MAX_VALUE);
    }
}
