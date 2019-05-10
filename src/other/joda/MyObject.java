package other.joda;

/**
 * @author memory
 * @date 2019/4/15
 */
public class MyObject {
    private String name;
    private Integer age;

    public MyObject(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
