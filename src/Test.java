/**
 * @author memory
 * @date 2019/4/29
 */
public class Test {
    public static void main(String[] args) {
        /*
        * int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2, 4, 5, 6, 7, 8, 9, 10};
        Test test = new Test();
        System.out.println(test.findMedianSortedArrays(nums1, nums2));
        System.out.println();
        int[] nums = {16, 7, 3, 20, 17, 8};
        for (int num : nums) {
            System.out.print(num + " ");
        }
        headSort(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }*/
        Test test = new Test();

        System.out.println("***************");
        System.out.println(test.times2(10));
        ;
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        /*num1和nums2不能同时为空*/
        if (nums1 == null || nums1.length == 0) {
            int n = nums2.length;
            int middle = n / 2;
            /*个数是奇数，返回一个值，个数是偶数，返回中间两个数的平均值*/
            if ((n & 1) == 1) {
                return nums2[middle];
            } else {
                return (((double) ((nums2[middle - 1] + nums2[middle]))) / 2);
            }
        }
        if (nums2 == null || nums2.length == 0) {
            int m = nums1.length;
            int middle = m / 2;
            /*个数是奇数，返回一个值，个数是偶数，返回中间两个数的平均值*/
            if ((m & 1) == 1) {
                return nums1[middle];
            } else {
                return (((double) (nums1[middle - 1] + nums1[middle])) / 2);
            }
        }
        int m = nums1.length;
        int n = nums2.length;
        int totalLength = m + n;
        int middle = totalLength / 2;
        int index = -1;/*表示当前数字在连个数组中，是第多少个*/
        int indexNum;
        int p1 = 0;
        int p2 = 0;
        int sum = 0;
        while (p1 < m && p2 < n) {
            if (nums1[p1] < nums2[p2]) {
                ++index;
                indexNum = nums1[p1];
                ++p1;
            } else {
                ++index;
                indexNum = nums2[p2];
                ++p2;
            }
            /*奇数，只需要返回一个数*/
            if ((totalLength & 1) == 1) {
                if (index == middle) {
                    return indexNum;
                }
            } else {
                if (index == middle - 1) {
                    sum += indexNum;
                } else if (index == middle) {
                    sum += indexNum;
                    return sum / 2;
                }
            }
        }
        if (p1 < m) {/*p2>n*/
            if ((totalLength & 1) == 1) {
                /*返回一个数字*/
                return (nums1[middle]);
            } else {

                if (p1 == 0) {
                    return ((double) (nums1[middle - n] + sum)) / 2;
                }
                return ((double) (nums1[middle - n - 1] + nums1[middle - n])) / 2;
            }
        } else {
            if ((totalLength & 1) == 1) {
                /*返回一个数字*/
                return (nums2[middle - m]);
            } else {
                if (p2 == 0) {
                    return ((double) (nums2[middle - m] + sum)) / 2;
                }
                return ((double) (nums2[middle - m - 1] + nums2[middle - m])) / 2;
            }
        }
    }

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

    public int times(int n) {
        if (n == 2 || n == 4) {
            return 2;
        }
        if (n == 1 || n == 3 || n == 5) {
            return 1;
        }
        return min(times(n - 1), times(n - 3), times(n - 5)) + 1;
    }

    /**
     * 求三者最小值
     */
    public int min(int a, int b, int c) {
        a = a < b ? a : b;
        return c < a ? c : a;
    }

    public int times2(int n) {
        int[] f = new int[n + 1];
        f[1] = 1;
        f[2] = 2;
        f[3] = 1;
        f[4] = 2;
        f[5] = 1;
        for (int index = 6; index <= n; index++) {
            int min = index;
            for (int i = 1; i <= index / 2; i++) {
                int currentTimes = f[i] + f[index - i];
                min = currentTimes < min ? currentTimes : min;
            }
            f[index] = min;
        }
        return f[n];
    }
}
