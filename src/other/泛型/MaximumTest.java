package other.泛型;


/**
 * @author memory
 * @date 2019/5/13
 */
public class MaximumTest {
    public static void main(String[] args) {
        System.out.print(String.format("%d,%d,%d 中的最大值是：%d\n", 2, 5, 1, getMax(2, 5, 1)));
        System.out.print(String.format("%.1f,%.1f,%.1f 中的最大值是：%.1f\n", 2.2, 5.5, 1.1, getMax(2.2, 5.5, 1.1)));
        System.out.print(String.format("%s,%s,%s 中的最大值是：%s\n", "apple", "orange", "pear", getMax("apple", "orange", "pear")));
        //getMax(new MyObject(1),new MyObject(2),new MyObject(3));
    }

    public static <E extends Comparable<E>> E getMax(E x, E y, E z) {
        E max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }
}

class MyObject {
    int age;

    public MyObject(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
