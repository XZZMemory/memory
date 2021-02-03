package other.reflectDemo;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws Exception {

        String fileName = "/Users/memory/IdeaProjects/memory/src/other/reflectDemo/config.txt";
        File configFile = new File(fileName);
        Properties properties = new Properties();
        properties.load(new FileInputStream(configFile));
        String className = properties.getProperty("class");
        String method = properties.getProperty("method");//获取配置文件要执行的函数
        try {
            Class class1 = Class.forName(className);//获取类
            Constructor constructor = class1.getConstructor();//构造函数
            Object object = constructor.newInstance();
            Method method1 = class1.getMethod(method);
            method1.invoke(object);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
