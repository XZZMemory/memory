package other.innerClass;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * created by memory
 * on 2019/8/29 16 52
 */
/*程序执行结果：
*
* Sta:2019-08-29: 18:19:37
执行构造方法2019-08-29: 18:19:37
执行构造方法2019-08-29: 18:19:39
***************************
2019-08-29: 18:19:41
2019-08-29: 18:19:41

Process finished with exit code 0*/
public class Sta {
    static SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd: HH:mm:ss");
    public static long date = System.currentTimeMillis();//1
    public int da = 1;//3,5

    //静态代码块
    static {
        System.out.println("Sta:" + sf.format(new Date()));//2
    }

    /*构造方法*/
    public Sta() {
        System.out.println("执行构造方法" + sf.format(new Date()));//4,6
    }

    /*静态内部类*/
    static class st {
        public static long date = System.currentTimeMillis();//8
    }

    public long getDate() {
        return st.date;//7,9
    }

    public static void main(String[] args) {
        Sta t = new Sta();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Sta t1 = new Sta();
        System.out.println("***************************");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(sf.format(t.getDate()));
        System.out.println(sf.format(t1.getDate()));
    }

}
