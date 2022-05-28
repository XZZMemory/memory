package other.排序算法;

/**
 * created by memory
 * on 2018/12/25 下午2:32
 */
public class Main {
    public static void main(String[] args) {
        int[] data = {2, 4, 7, 2, 1};
        System.out.println("before");
        ShellSort shellSort = new ShellSort();
        shellSort.sort(data);
        System.out.println("after");
        System.out.println(data);
    }


    /**
     * 简单选择排序
     * 在要排序的一组数中，选出最小（或者最大）的一个数与第1个位置的数交换；
     * 然后在剩下的数当中再找最小（或者最大）的与第2个位置的数交换，
     * 依次类推，直到第n-1个元素（倒数第二个数）和第n个元素（最后一个数）比较为止。
     */

    public static void select_sort(int array[], int lenth) {

        for (int i = 0; i < lenth - 1; i++) {

            int minIndex = i;
            for (int j = i + 1; j < lenth; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    /**
     * 堆排序
     */

    public static void headSort(int[] list) {
        for (int i = (list.length - 1) / 2; i > 0; --i) {
            headAdjust(list, list.length - 1, i);
        }
        //排序，将最大的节点放在堆尾，然后从根节点重新调整
        for (int i = list.length - 1; i > 0; --i) {
            int temp = list[0];
            list[0] = list[i];
            list[i] = temp;
            headAdjust(list, list.length - 1, 0);
        }
        //构造初始堆,从第一个非叶子节点开始调整,左右孩子节点中较大的交换到父节点中
    }

    public static void headAdjust(int[] list, int len, int i) {
        int k = i, index = 2 * k + 1, temp = list[i];
        while (index < len) {
            if (index + 1 < len) {
                if (list[index + 1] > list[index]) {
                    index = index + 1;
                }
            }
            if (list[index] > temp) {
                list[k] = list[index];
                k = index;
                index = 2 * k + 1;
            }
        }
        list[k] = temp;
    }
}
