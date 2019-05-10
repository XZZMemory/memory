import java.util.Scanner;

/**
 * @author memory
 * @date 2019/4/29
 */
public class Test {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String str = getRLE(s);
        System.out.println(str);
        */
        String string1=null;
        System.out.println("string1:"+string1+"输出完毕");
        String string2="";
        System.out.println("string2:"+string2+"输出完毕");
        char[] charArray = new char[] { 'a', 'b', 'c', 'd', 'e'};
        String str3 = new String(charArray );
        byte[] byteArray  = str3.getBytes();
        for (int i = 0; i <byteArray.length ; i++) {
            System.out.println("byteArray["+i+"] : "+byteArray[i]);
        }
        System.out.println("byteArray:"+byteArray.toString());

    }

    public static String getRLE(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        StringBuffer sb = new StringBuffer();
        int start = 0;//数字的开始
        char[] array = str.toCharArray();
        int currentSum=0;//当前值
        int sum=0;//总和
        int flag=0;
        /** 1:减   2: 加*/
        for (int i = 0; i < array.length ; i++) {
            if (array[i]=='-'||array[i]=='+'){
                if (flag!=0){
                    currentSum= Integer.valueOf(str.substring(start,i-1));
                    sum=getSum(currentSum,flag,sum);
                    start=i+1;
                }
                if (array[i]=='-'){
                    flag=1;
                }
                else if (array[i]=='+'){
                    flag=2;
                }
            }
        }
        return String.valueOf(sum);
    }
    public static int getSum(int currentSum,int flag,int sum){
        if (flag==1){
            sum-=currentSum;
        }
        else if(flag==2){
            sum+=currentSum;
        }
        return sum;
    }
}
