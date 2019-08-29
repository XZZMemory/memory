package other.jdk8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * created by memory
 * on 2019/8/28 22 28
 */
public class Test {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("ddd2");
        stringList.add("aaa2");
        stringList.add("bbb1");
        stringList.add("aaa1");
        stringList.add("bbb3");
        stringList.add("ccc");
        stringList.add("bbb2");
        stringList.add("ddd1");
        // 测试 Sort (排序)
        stringList
                .stream()
                .sorted(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o2.compareTo(o1);
                    }
                })
                .forEach(System.out::println);// aaa1 aaa2
        // 测试 Filter(过滤)
        stringList.stream()
                .filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);//aaa2 aaa1
    }
}
