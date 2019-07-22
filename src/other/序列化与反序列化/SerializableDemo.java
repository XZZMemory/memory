package other.序列化与反序列化;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * created by memory
 * on 2019/7/9 20 22
 */
public class SerializableDemo {
    public static void main(String[] args) {
        MyObject employee = new MyObject("xiao", "shenqiu", "12345", 1);
        try {
            File file = new File("./object.txt");
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getCanonicalPath());
            FileOutputStream fileOutputStream = new FileOutputStream("./object.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            try {
                objectOutputStream.writeObject(employee);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                fileOutputStream.close();
                objectOutputStream.close();
                System.out.println("序列化数据已保存在文件中");
            }
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
