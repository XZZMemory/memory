package other.排序算法;

/**
 * 希尔排序四插入排序的一种，也称缩小增量排序，非稳定算法
 * 希尔排序把记录按照增量排序分组，对每组使用直接插入算法排序
 * 随着增量减少，每组包含的关键词越来越多，当增量减至1，整个文件分成一组，算法终止
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] data = {57, 68, 59, 52, 72, 28};
        System.out.println("before");
        System.out.println(data.hashCode());
        //sort(data);
        System.out.println("after");
        System.out.println(data);
    }

    public void sort(int[] data) {
        System.out.println(this.getClass().getClassLoader().toString());
        if (data == null || data.length == 0 || data.length == 1)
            return;
        int length = data.length;
        int h = 1;
        while (h < length / 3)//步长
            h = h * 3 + 1;
        while (h >= 1)//增量大于1
        {
            for (int i = h; i < length; i++) {
                for (int j = i; j >= h && less(data, j, j - h); j -= h) {
                    exch(data, j, j - h);
                }
            }
            h = h / 3;
        }
    }

    public static void exch(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public static boolean less(int[] data, int i, int j) {
        return data[i] < data[j];
    }

    public static void shell_sort(int array[], int lenth) {

        int temp = 0;
        int incre = lenth;
        while (true) {
            incre = incre / 2;//incre:步长
            for (int k = 0; k < incre; k++) {    //根据增量分为若干子序列 0-> incre-1
                for (int i = k + incre; i < lenth; i += incre) {
                    for (int j = i; j > k; j -= incre) {
                        if (array[j] < array[j - incre]) {
                            temp = array[j - incre];
                            array[j - incre] = array[j];
                            array[j] = temp;
                        } else {
                            break;
                        }
                    }
                }
            }

            if (incre == 1) {
                break;
            }
        }
    }
}
