package other.类加载器;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * @author memory
 * @date 2019/4/17
 */
public class ClassLoaderPathTest {
    public static void main(String[] args) {
        System.out.println("打印类加载器的路径等信息");
        ClassLoaderPathTest classLoaderPathTest = new ClassLoaderPathTest();
        try {
            classLoaderPathTest.showURL();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("BootstrapClassLoader 的加载路径: ");

        String[] bootUrls = System.getProperty("sun.boot.class.path").split(";");
        for (String str:bootUrls){
            System.out.println(str);
        }

        URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
        for (URL url : urls) {
            System.out.println(url);
        }
        System.out.println("----------------------------");

        //取得扩展类加载器
        URLClassLoader extClassLoader = (URLClassLoader) ClassLoader.getSystemClassLoader().getParent();

        System.out.println(extClassLoader);
        System.out.println("扩展类加载器 的加载路径: ");

        urls = extClassLoader.getURLs();
        for (URL url : urls) {
            System.out.println(url);
        }
        System.out.println("----------------------------");


        //取得应用(系统)类加载器
        URLClassLoader appClassLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();

        System.out.println(appClassLoader);
        System.out.println("应用(系统)类加载器 的加载路径: ");

        urls = appClassLoader.getURLs();
        for (URL url : urls) {
            System.out.println(url);
        }
        System.out.println("----------------------------");
    }

    public void showURL() throws IOException {
        // 第一种：获取类加载的根路径   D:\git\daotie\daotie\target\classes
        File f = new File(this.getClass().getResource("/").getPath());
        System.out.println("f: " + f);

        // 获取当前类的所在工程路径; 如果不加“/”  获取当前类的加载目录  D:\git\daotie\daotie\target\classes\my
        File f2 = new File(this.getClass().getResource("").getPath());
        System.out.println("f2:" + f2);

        // 第二种：获取项目路径    D:\git\daotie\daotie
        File directory = new File("");// 参数为空
        String courseFile = directory.getCanonicalPath();
        System.out.println("courseFile: " + courseFile);


        // 第三种：  file:/D:/git/daotie/daotie/target/classes/
        URL xmlpath = this.getClass().getClassLoader().getResource("");
        System.out.println("xmlpath:" + xmlpath);


        // 第四种： D:\git\daotie\daotie
        System.out.println("user.dir:" + System.getProperty("user.dir"));
        /*
         * 结果： C:\Documents and Settings\Administrator\workspace\projectName
         * 获取当前工程路径
         */

        // 第五种：  获取所有的类路径 包括jar包的路径
        System.out.println("java.class.path:" + System.getProperty("java.class.path"));

    }


    //递归
    public static int recursionBinarySearch(int[] arr, int key, int low, int high) {
        if (key < arr[low] || key > arr[high] || low > high) {
            return -1;
        }
        int middle = (low + high) / 2;
        if (arr[middle] > key) {
            //比关键字大则在左区域
            return recursionBinarySearch(arr, key, low, middle - 1);
        } else if (arr[middle] < key) {
            //比关键字小则在右区域
            return recursionBinarySearch(arr, key, middle + 1, high);
        } else {
            return middle;
        }
    }

}
