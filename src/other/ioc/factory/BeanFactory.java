package other.ioc.factory;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * ioc： 工厂模式+反射机制
 * 使用反射机制时的工厂模式
 */
public class BeanFactory {
    //config.txt 相当于配置文件 声明bean的文件
    static final String configPath = "/Users/memory/IdeaProjects/memory/src/other/ioc/config.txt";

    public static <T> T newInstance(String name) throws Exception {
        File file = new File(configPath);
        Properties properties = new Properties();
        properties.load(new FileInputStream(file));
        String path = properties.getProperty(name);
        if (path == null) {
            System.out.println("配置文件中找不到bean: " + name + ",请查看是否注册该bean!");
            return null;
        }
        Class cl = Class.forName(path);
        return (T) cl.newInstance();
    }
}
