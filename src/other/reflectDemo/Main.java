package other.reflectDemo;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws Exception {

        File configFile = new File("E:\\memory-master\\src\\reflectDemo\\config.txt");
        Properties properties = new Properties();
        properties.load(new FileInputStream(configFile));
        String className = properties.getProperty("class");
        String method = properties.getProperty("method");
        try {
            Class class1 = Class.forName(className);
            Constructor constructor = class1.getConstructor();
            Object object = constructor.newInstance();
            Method method1 = class1.getMethod(method);
            method1.invoke(object);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
