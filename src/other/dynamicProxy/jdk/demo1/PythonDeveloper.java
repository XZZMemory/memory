package other.dynamicProxy.jdk.demo1;

public class PythonDeveloper implements Developer {
    private String name;

    public PythonDeveloper(String name) {
        this.name = name;
    }

    @Override
    public void code() {
        System.out.println(name + " is coding python");
    }

    @Override
    public void debug() {
        System.out.println(name + " is debugging python");
    }
}
