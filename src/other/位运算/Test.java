package other.位运算;

/**
 * @author memory
 * @date 2019/5/13
 */
public class Test {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("a是：" + a + "  二进制表示是：" + Integer.toBinaryString(a));
        System.out.println("algorithm.a<<2的结果是：" + (a << 2) + "  二进制表示是：" + Integer.toBinaryString(a << 2));
        System.out.println("algorithm.a>>2的结果是：" + (a >> 2) + "  二进制表示是：" + Integer.toBinaryString(a >> 2));
        System.out.println("algorithm.a>>>2的结果是：" + (a >>> 2) + "  二进制表示是：" + Integer.toBinaryString(a >>> 2));
        int b = -5;
        //11  1111  1111  1111  1111  1111  1111 1110
        System.out.println("b是：" + b + "  二进制表示是：" + Integer.toBinaryString(b));
        System.out.println("b<<2的结果是：" + (b << 2) + "  二进制表示是： " + Integer.toBinaryString(b << 2));
        System.out.println("b>>1结果是：" + (b >> 1) + "  二进制表示是： " + Integer.toBinaryString(b >> 1));
        System.out.println("b>>2的结果是：" + (b >> 2) + "  二进制表示是： " + Integer.toBinaryString(b >> 2));
        System.out.println("b>>>2的结果是：" + (b >>> 2) + "  二进制表示是： " + Integer.toBinaryString(b >>> 2));
        System.out.println(((-10)>>1)+"    "+(-10/2) );
        System.out.println(((-10)>>2)+"    "+(-10/4));
        System.out.println(((10)<<2)+"    "+(10*4));
        short c=19;
        System.out.println("*************"+(c>>2));
        byte d=20;
        System.out.println("^^^^^^^^^^^^^^^^^  "+(d>>2));
    }
}
