package other.equalsPKhashcode;

import java.util.*;

/**
 * created by memory
 * on 2019/7/11 20 48
 */
public class Main {
    public static void main(String[] args) {
        Set<MyObject> set=new HashSet<MyObject>();
        MyObject myObject1=new MyObject(10);
        MyObject myObject2=new MyObject(10);
        set.add(myObject1);
        set.add(myObject2);
        System.out.println("set的大小是： "+set.size());
        Iterator<MyObject> iterator=set.iterator();
        while (iterator.hasNext()){
            MyObject my=iterator.next();
            System.out.println(my.toString()+" "+ my.score);
            iterator.remove();
        }
    }
    }
