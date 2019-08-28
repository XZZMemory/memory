package other.annotations;

/**
 * created by memory
 * on 2019/8/28 11 39
 */
public class Test {


    @MyAnnotation
    public void test() {
        System.out.println("test函数：i=" + 5);
    }
    public void my(){
        System.out.println("my函数...");
    }

}
