package other.jdk8.stream;

import java.util.HashMap;
import java.util.List;

/**
 * created by memory
 * on 2019/8/30 12 10
 */
/*中间操作 map 会将元素根据指定的 Function 接口来依次将元素转成另外的对象。*/
public class MapOperate {
    public static void main(String[] args) {
        List<String> stringList = Utils.getStringList();
        // 测试 Map 操作
        stringList
                .stream()
                .map(String::toUpperCase)
                .sorted((a, b) -> b.compareTo(a))
                .forEach(System.out::println);// "DDD2", "DDD1", "CCC", "BBB3", "BBB2", "AAA2", "AAA1"

    }
}
