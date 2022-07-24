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
public class ObjectTest {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        Student stu1 = new Student();
        stu1.setScore(100);
        stu1.setAge(27);
        students.add(stu1);

        Student stu2 = new Student();
        stu2.setScore(56);
        stu2.setAge(29);
        students.add(stu2);

        Student stu3 = new Student();
        stu3.setScore(90);
        stu3.setAge(28);
        students.add(stu3);

        System.out.println("按照年龄排序");
        Collections.sort(students,new AgeComparator());
        for (Student stu : students) {
            System.out.println(stu.getAge());
        }
        System.out.println("按照分数排序");
        Collections.sort(students, new ScoreComparator());
        for (Student stu : students) {
            System.out.println(stu.getScore());
        }
    }


    /**
     * 分数比较器(根据分数，进行升序或者降序排序)
     */
    public static class ScoreComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.score - o2.score;
        }
    }

    /**
     * 年龄比较器，根据年龄比较
     */
    public static class AgeComparator implements Comparator<Student> {
        @Override
        public int compare(Student p1, Student p2) {
            return (p1.age - p2.age);
        }

    }
}
