package algorithm.yang;

public class Main2 {
    public static void main(String[] args) {
        int[] data1 = {2, 4};
        int[] data2 = {1,2, 5};
        int[] result = swap(data1, data2);
        if (result != null) {
            for (int elem : result) {
                System.out.print(elem + " ");
            }
        }
    }

    public static int[] swap(int[] data1, int[] data2) {
        // data1和data2都是排序的数组
        if (data1 == null || data1.length < 1 || data2 == null || data2.length < 1) {
            return null;
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int data : data1) {
            sum1 += data;
        }
        for (int data : data2) {
            sum2 += data;
        }
        boolean flag = false;
        //交换，小的在前，大的在后
        if (sum1 > sum2) {
            int[] temp;
            temp = data1;
            data1 = data2;
            data2 = temp;
            int t = sum1;
            sum1 = sum2;
            sum2 = t;
            flag = true;
        }
        int reduceNum = (sum2 - sum1);
        //二者之差是奇数，则不可交换
        if ((reduceNum & 1) == 1) {
            return null;
        }
        int transferNum = reduceNum >> 1;
        int index1 = -1;
        int dataIndex1 = 0;
        int[] result = new int[2];
        //判断data2中是不是有个元素等于 transferNum
        for (int index2 = 0; index2 < data2.length; index2++) {
            if (data2[index2] == transferNum) {
                if (flag) {
                    result[0] = data2[index2];
                    result[1] = dataIndex1;
                } else {
                    result[0] = dataIndex1;
                    result[1] = data2[index2];
                }
                return result;
            } else if (data2[index2] > transferNum) {
                break;
            }
        }
        // 判断data1 和data2 中是有有元素之差等于 transferNum
        for (int index2 = 0; index2 < data2.length; index2++) {
            if (data2[index2] - dataIndex1 == transferNum) {
                if (flag) {
                    result[0] = data2[index2];
                    result[1] = dataIndex1;
                } else {
                    result[0] = dataIndex1;
                    result[1] = data2[index2];
                }
                return result;
            } else if (data2[index2] - dataIndex1 > transferNum) {
                ++index1;
                dataIndex1 = data1[index1];
            } else {
                return null;
            }
        }
        return null;
    }
}
