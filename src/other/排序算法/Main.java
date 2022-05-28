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
