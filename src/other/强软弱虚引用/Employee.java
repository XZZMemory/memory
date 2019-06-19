package other.强软弱虚引用;

public class Employee {
    private String id;
    private String name;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public Employee(String id) {
        this.id = id;
        getDataFromINfoCenter();

    }

    //到数据库中获取信息
    private void getDataFromINfoCenter() {
    }

}
