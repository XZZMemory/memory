package other.reflectDemo;

import other.reflectDemo.pojo.HeroPlus;

import java.lang.reflect.Field;

/**
 * 获取成员变量并修改和使用
 */
public class ParaTest {
    public static void main(String[] args) {
        HeroPlus heroPlus = new HeroPlus();
        heroPlus.name = "memory";
        try {
            /**  获取对象heroPlus 名字叫做“name" 的字段*/
            Field field = heroPlus.getClass().getField("name");
            /** 修改这个字段的值*/
            field.set(heroPlus, "change");
            /** 打印修改后的值*/
            System.out.println("修改后的值：" + heroPlus.getName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
