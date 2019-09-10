package other.序列化与反序列化;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * created by memory
 * on 2019/7/9 21 26
 */
public class DeserializeDemo {
    public static void main(String[] args) {
        int [][] mdata=new int[3][2];
        Arrays.sort(mdata, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return 0;
            }
        });
        try {
            FileInputStream fileInputStream = new FileInputStream("./object.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            MyObject myObject = (MyObject) objectInputStream.readObject();
            System.out.println(myObject.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }
}
