package other.序列化与反序列化;

import java.io.Serializable;

/**
 * created by memory
 * on 2019/7/9 20 23
 */
public class MyObject implements Serializable {
    public String name;
    public static String address;
    public transient String password;
    public int number;
    public int o = 0;

    private static final long serialVersionUID = 8656128222714547171L;

    public MyObject(String name, String address, String password, int number) {
        this.name = name;
        this.address = address;
        this.password = password;
        this.number = number;
    }

    public String toString() {
        return ("MyObject name:" + name + " address：" + address + " password: " + password + " number: " + number);
    }
}
