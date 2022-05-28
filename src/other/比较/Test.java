package other.比较;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * description:memory
 *
 * @author xiaozhenzhen001
 * @date 2022/5/20
 */
public class Test {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("hello1");
        stringList.add("hello2");
        stringList.add("hello3");
        Collections.sort(stringList);
        System.out.println(stringList.toString());
    }


}