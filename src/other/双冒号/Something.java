package other.双冒号;

/**
 * Description:memory
 * Created by xiaozhenzhen001
 * on 2021/6/8
 */
public class Something {


    // constructor methods
    Something() {
    }

    Something(String something) {
        System.out.println(something);
    }

    // static methods
    static String startsWith(String s) {
        return String.valueOf(s.charAt(0));
    }

    // object methods
    String endWith(String s) {
        return String.valueOf(s.charAt(s.length() - 1));
    }

    void endWith() {
    }

}
