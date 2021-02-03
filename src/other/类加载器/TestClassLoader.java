package other.类加载器;

import java.io.*;

/**
 * created by memory
 * on 2018/12/25 下午10:07
 */

public class TestClassLoader extends ClassLoader {

    private String name;

    public TestClassLoader(ClassLoader parent, String name) {
        super(parent);
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public Class<?> findClass(String name) {

        InputStream is = null;
        byte[] data = null;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            File file = new File("/Users/memory/IdeaProjects/CodingInterviewGuide/src/other/类加载器/CloneDemo.java");
            System.out.println(file.length());
            is = new FileInputStream(file);
            int c = 0;
            while (-1 != (c = is.read())) {
                baos.write(c);
            }
            data = baos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
                baos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return this.defineClass(name, data, 0, data.length);
    }

    public static void main(String[] args) {
        TestClassLoader loader = new TestClassLoader(
                TestClassLoader.class.getClassLoader(), "TestLoader");
        Class clazz;
        try {
            clazz = loader.loadClass("other.类加载器.Test");
            Object object = clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

