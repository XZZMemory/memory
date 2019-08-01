package other.reflectDemo;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 反射越过泛型检查
 */
public class GenericityTest {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();
        list.add("xixi");
        list.add("haha");
        Method method = list.getClass().getMethod("add", Object.class);
        method.invoke(list, 89);
        for (Object p : list) {
            System.out.println(p);
        }
    }
}
