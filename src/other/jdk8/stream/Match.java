package other.jdk8.stream;

import java.util.List;

/**
 * created by memory
 * on 2019/8/30 12 12
 */
/*Stream提供了多种匹配操作，允许检测指定的Predicate是否匹配整个Stream。所有的匹配操作都是 最终操作 ，并返回一个 boolean 类型的值。*/
public class Match {
    public static void main(String[] args) {
        List<String> stringList = Utils.getStringList();
        // 测试 Match (匹配)操作
        boolean anyStartsWithA =
                stringList
                        .stream()
                        .anyMatch((s) -> s.startsWith("a"));
        System.out.println(anyStartsWithA);      // true
        boolean allStartsWithA =
                stringList
                        .stream()
                        .allMatch((s) -> s.startsWith("a"));

        System.out.println(allStartsWithA);      // false

        boolean noneStartsWithZ =
                stringList
                        .stream()
                        .noneMatch((s) -> s.startsWith("z"));

        System.out.println(noneStartsWithZ);      // true }
    }
}
