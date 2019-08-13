package other.dynamicProxy.jdk.demo1;

public class JavaDeveloper implements Developer ,Developer2{
    private String name;

    public JavaDeveloper(String name) {
        this.name = name;
        System.out.println("执行构造函数");
    }

    public String getName() {
        return name;
    }

    @Override
    public void code() {
        System.out.println(name + " is coding java");
    }

    @Override
    public void debug() {
        System.out.println(name + " is debugging java");
    }

    @Override
    public void cook() {
        System.out.println(name+" is cooking java ");
    }
}
