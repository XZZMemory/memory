package other.optionalTest;

import java.util.Optional;

/**
 * @author memory
 * @date 2019/5/7
 */
public class Test {
    public static void main(String[] args){
        /* ofNullable和of*/
        String name=null;
        String nametrue="xiao";
        Optional<String> optional=Optional.ofNullable(name);
        String nameEmpty=null;//"Not default";
        nameEmpty=Optional.ofNullable(nameEmpty).orElseGet(()->"default");
        Optional<String> optionalTrue=Optional.ofNullable(nametrue);

        System.out.println(optional);
        System.out.println("是否有值："+optional.isPresent());
        System.out.println("是否有值："+optionalTrue.isPresent());
        System.out.println("empty:"+nameEmpty);

        Test test =new Test();
        String text="xiao";

        System.out.println("Using orElseGet:");
        String defaultText =
                Optional.ofNullable(text).orElseGet(()-> test.getMyDefault());
        System.out.println("Default Value: "+ defaultText);

        System.out.println("Using orElse:");
        defaultText = Optional.ofNullable(text).orElse(test.getMyDefault());
        System.out.println("Default Value: "+ defaultText);
        /***/
        String nullName=null;
        String name4 = Optional.ofNullable(nullName).orElseThrow(NullPointerException::new);
    }
    public String getMyDefault() {
        System.out.println("Getting Default Value");
        return "Default Value";
    }
}
