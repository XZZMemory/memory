package other.泛型;

import javax.print.attribute.standard.NumberUp;
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
         list.add(3);
         List<String> list = new ArrayList<>();
         list.add("string1");
         list.add("string2");
         //list.add(3);报错
         for (int i = 0; i < list.size(); i++) {
         String currentData = list.get(i);
         System.out.println(i + ": " + currentData);
         }*/
        /**   Box<String> name = new Box<>();
         name.add("memory");
         Box<Integer> age = new Box<>();
         age.add(24);
         System.out.println("name: " + name.get());
         System.out.println("age: " + age.get());
         System.out.println("name类的类型："+name.getClass());
         System.out.println("age类的类型："+age.getClass());
         System.out.println(name.getClass()==age.getClass());*/
        Integer[] integerArray = new Integer[]{1, 2, 3, 4};
        System.out.println("Integer数组改变前的数据是：");
        printArrray(integerArray);
        Integer[] changedIntArray = changeData(integerArray);
        System.out.println("Integer数组改变后的数据是：");
        printArrray(changedIntArray);
        Character[] characterArray = new Character[]{'a', 'b', 'c', 'd'};
        System.out.println("Character数组改变前的数据是：");
        printArrray(characterArray);
        Character[] changedCharacterArray = changeData(characterArray);
        System.out.println("Character数组改变后的数据是：");
        printArrray(changedCharacterArray);


        List<String> name = new ArrayList<>();
        List<Integer> age = new ArrayList<>();
        List<Number> number = new ArrayList<>();
        name.add("memory");
        age.add(18);
        number.add(100);
        getDataOfList(name);
        getDataOfList(age);
        getDataOfList(number);
        Box<Number> score= new Box<>(39.3);
        Box<Integer> age1=new Box<>(18);
        getData(score);
        //getData(age1);
    }

    public static void getData(Box<Number> data){
        System.out.println(data.get());
    }
    public static void getDataOfList(List<?> data) {
        System.out.println("当前数据是：" + data.get(0));
    }

    public static <E> E[] changeData(E[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        for (int i = 0, j = array.length - 1; i < array.length / 2; i++, j--) {
            E temp;
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }

    public static <E> void printArrray(E[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

class Box<T> {
    private T data;

    public Box() {}

    public Box(T data) {
        this.data = data;
    }

    public T get() {
        return data;
    }

    public void add(T data) {
        this.data = data;
    }
}
