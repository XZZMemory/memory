package 内部类.第二种局部内部类;

/**
 * @author memory
 * @date 2019/4/29
 */
class People {
    public People() {
    }
}

public class Man {
    public Man(){}
    /** 局部内部类*/
    class Woman extends People{
        int age=0;
    }
    public Woman getWoman(){
        return new Woman();
    }
}
