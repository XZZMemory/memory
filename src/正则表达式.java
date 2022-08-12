/**
 * description:memory
 *
 * @author xiaozhenzhen001
 * @date 2022/8/11
 */
public class 正则表达式 {
    public static void main(String[] args) {

        String s = "a b";
        String regex = "a+\\s+";//定义手机好规则
        boolean flag = s.matches(regex);//判断功能
        System.out.println("flag:" + flag);

    }
}
