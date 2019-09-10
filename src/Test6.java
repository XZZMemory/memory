public class Test6 {

    public static void main(String[] args) {
        int[] dat = {3, 1, 4};
        double a=5;
        System.out.println(a/2);
        //findInt(dat);
    }

    //数组中未出现的最小正整数
    public static int findInt(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int l = 0;
        int r = arr.length;
        while (l < r) {
            if (arr[l] == l + 1) {//正常情况，1，2，3，4，arr[0]=1
                l++;
            } else if (arr[l] <= l || arr[l] > r || arr[arr[l] - 1] == arr[l]) {
                //出现了 负数、乱序和重复的情况（？）
                arr[l] = arr[--r];//把最后位置的数放在位置l上检查
            } else {//发现了[l+1,r]范围的数，并且未发现重复
                swap(arr, l, arr[l]-1);//arr[l]应该放到arr[l]-1位置上，交换（？）
            }

        }
        return l + 1;//最终l、r相遇，arr已经包含的正整数范围是[1,l]，返回l+1

    }

    public static void swap(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
}
