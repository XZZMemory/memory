package other.equals和hashcode方法;

/**
 * created by memory
 * on 2019/7/11 19 57
 */
public class MyObject {
    int score;

    public MyObject(int score) {
        this.score = score;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;//凸优化
        }
        if (object == this) {
            return true;
        }
        if (!(object instanceof MyObject)) {
            return false;
        }
        MyObject other=(MyObject)object;
        if (other.score==this.score){
            return true;
        }
        return false;
    }
    //Object中将对象在内存中的地址转换为10进制整数输出
    public int hashCode(){
         final int prime=10;
         int result=1;
         result+=prime*result+this.score;
         return result;
    }
}
