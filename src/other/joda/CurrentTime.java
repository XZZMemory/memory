package other.joda;

import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

/**
 * @author memory
 * @date 2019/4/15
 */
public class CurrentTime {
    public static void main(String[] args){
        long currentTime=System.currentTimeMillis();
        System.out.println(currentTime);
        long afterTime=currentTime+1000*3600*24*10;
        System.out.println(afterTime);
        SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("当前时间： "+df1.format(1554111386132L));
        System.out.println("一个月之后的时间： "+df1.format(afterTime));
        List<Long> list =new LinkedList<>();
        list.add(Long.valueOf(90));
        System.out.println(String.valueOf(list));
        List<MyObject> myObjectList=new LinkedList<>();
        myObjectList.add(new MyObject("memory",18));
        myObjectList.add(new MyObject("joda",1));
        System.out.println(String.valueOf(myObjectList));

    }
}
