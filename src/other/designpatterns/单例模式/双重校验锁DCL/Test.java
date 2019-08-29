package other.designpatterns.单例模式.双重校验锁DCL;

public class Test {
    public static void main(String[] args) {
        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的，构造函数访问修饰符是private，只有当前类能调用
        //SingleObject object = new SingleObject();
        /* Object对象的方法：
         * 1. hashCode()将对象在内存中的地址转换为int值
         * 2. equals(Object obj) 其他某个对象是否与此对象的地址相等
         * 3. toString() 返回该对象的字符串表示  “类名+@+hashcode”值
         *   public String toString() {
                 return getClass().getName() + "@" + Integer.toHexString(hashCode());
             }

          */
        //获取唯一可用的对象
        Singleton object = Singleton.getInstance();
        System.out.println("1:" + object.toString() + " " + object.hashCode());

        //显示消息
        Singleton object2 = Singleton.getInstance();
        System.out.println("2:" + object2.toString() + " " + object.hashCode());
        Singleton object3 = Singleton.getInstance();
        System.out.println("3:" + object3.toString() + " " + object3.hashCode());
        System.out.println("4:" + object.equals(object2));
    }
}
