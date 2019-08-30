package other.jdk8.stream;

import java.util.List;
import java.util.Optional;

/**
 * created by memory
 * on 2019/8/30 12 17
 */
/*这是一个 最终操作 ，允许通过指定的函数来讲stream中的多个元素规约为一个元素，规约后的结果是通过Optional 接口表示的*/
public class Reduce {
    public static void main(String[] args) {
        List<String> stringList = Utils.getStringList();
        //测试 Reduce (规约)操作
        Optional<String> reduced =
                stringList
                        .stream()
                        .sorted()
                        .reduce((s1, s2) -> s1 + "#" + s2);

        reduced.ifPresent(System.out::println);//aaa1#aaa2#bbb1#bbb2#bbb3#ccc#ddd1#ddd2}
    }
}
