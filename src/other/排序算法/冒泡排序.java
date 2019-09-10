package other.排序算法;

//升序
public class 冒泡排序 {
    public static void main(String[] args) {
        int[] data = {1, 3, 9, 5, 4, 2};
        bubbleSort(data);
    }

    public static void bubbleSort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 1; j < data.length - i; j++) {
                if (more(data, j - 1, j)) {
                    exch(data, j - 1, j);
                }
            }
        }
    }
    public static void BubbleSort1(int [] arr){

        int temp;//临时变量
        boolean flag;//是否交换的标志
        for(int i=0; i<arr.length-1; i++){   //表示趟数，一共 arr.length-1 次

            // 每次遍历标志位都要先置为false，才能判断后面的元素是否发生了交换
            flag = false;

            for(int j=arr.length-1; j>i; j--){ //选出该趟排序的最大值往后移动

                if(arr[j] < arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    flag = true;    //只要有发生了交换，flag就置为true
                }
            }
            // 判断标志位是否为false，如果为false，说明后面的元素已经有序，就直接return
            if(!flag) break;
        }
    }
    public static void exch(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public static boolean more(int[] data, int i, int j) {
        return data[i] > data[j];
    }
}
