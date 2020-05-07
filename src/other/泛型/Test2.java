package other.泛型;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        Byte[] bs = new Byte[10];
        for (int i = 0; i < 10; ++i) {
            bs[i] = 8;
        }
        ArrayList<Byte> bsList = Test2.newArrayList(bs);
        System.out.println(bsList.size());
        Byte b =  new Byte("4");
    }

    public static <E> ArrayList<E> newArrayList(E... elements) {
        ArrayList<E> list = new ArrayList<>(elements.length);
        for (E e : elements) {
            list.add(e);
        }
        return list;
    }

}
