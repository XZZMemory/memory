package other.对象创建的方法.clone;

public class CloneDemo {
    public static void main(String[] args) {
        Obj a = new Obj();
        Obj b = (Obj) a.clone();//浅复制
        b.chanegBirth();
        Obj c = (Obj) a.getObject().clone();//深复制
        System.out.println(a.toString() + " " + a.getBirth() + " " + a.getList().toString());
        System.out.println(a.toString() + " " + b.getBirth() + " " + b.getList().hashCode());
        System.out.println(c.toString() + " " + c.getBirth() + " " + c.getList().toString());
    }
}
