package other.jdk8.stream.jihe;

import other.gc.MyObject;
import other.jdk8.stream.CollectionUtils;
import other.jdk8.stream.MapOperate;
import other.model.Student;

import java.util.*;

/**
 * description:memory
 *
 * @author xiaozhenzhen001
 * @date 2022/1/21
 */
public class MapUsage {
    public static void main(String[] args) {
        // java 8前，从map中取值等操作如下所示
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "学生1"));
        list.add(new Student(3, "学生3"));

        Map<Integer, List<Student>> map = new HashMap();
        list.forEach(student -> {
            map.computeIfAbsent(student.getId(), key -> new LinkedList<>()).add(student);
        });

        System.out.println(StringUtils.toString(map));
        Map<Integer, List<Student>> map2 = new HashMap();
        list.forEach(student -> {
            CollectionUtils.computeIfAbsent(map2, student.getId(), key -> new LinkedList<>()).add(student);
        });
        System.out.println(StringUtils.toString(map2));

    }
}
