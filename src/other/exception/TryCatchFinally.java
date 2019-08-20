package other.exception;

public class TryCatchFinally {
    public static void main(String[] args) {
        System.out.println(test());
    }

    public static String test() {
        int[] array = new int[2];
        try {
            array[1] = 0;//到这出现异常
            System.out.println("执行try语句");
            return "try";
        } catch (Exception e) {
            System.out.println("出现异常！");
        } finally {
            System.out.println("执行finally语句");
            //return "finally";
        }
//        System.out.println("B");
//        return "last";
        return "last";
    }
}
