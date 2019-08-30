package other.jdk8.stream;

import java.util.Comparator;
import java.util.List;

/**
 * created by memory
 * on 2019/8/30 12 06
 */
/*("ddd2")("aaa2")("bbb1")("aaa1")("bbb3")("ccc")("bbb2");("ddd1")*/
public class Sorted {
    public static void main(String[] args) {
        List<String> stringList = Utils.getStringList();
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
    }
}
