package other.泛型;

import java.util.ArrayList;
import java.util.List;

/**
 * @author memory
 * @date 2019/5/10
 */
public class GenericTest {
    public static void main(String[] args) {
        /**
         List list=new ArrayList();
         list.add("string1");
         list.add("string2");
         list.add(3);*/
        List<String> list = new ArrayList<>();
        list.add("string1");
        list.add("string2");
        //list.add(3);报错
        for (int i = 0; i < list.size(); i++) {
            String currentData = list.get(i);
            System.out.println(i + ": " + currentData);
        }
    }
}
