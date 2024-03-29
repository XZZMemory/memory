import java.math.BigInteger;
import java.util.Collections;

/**
 * @author memory
 * @date 2019/4/29
 */
public class Test {
    public static void main(String[] args) {
        int[] data = new int[29999];
        Solution s = new Test().new Solution();
        s.sortArray(data);

    }

    class Solution {
        public int[] sortArray(int[] nums) {
            // 使用堆排序
            // 1.调整为大根堆
            for (int index = nums.length / 2; index >= 0; index--) {
                headAdjust(nums, index, nums.length - 1);
            }
            // 2.【0】与最后一个元素交换，排序
            for (int index = nums.length - 1; index > 0; index--) {
                swap(nums, 0, index);
                headAdjust(nums, 0, index - 1);
            }
            return nums;
        }

        public void headAdjust(int[] nums, int index, int maxIndex) {
            System.out.println(index + " " + maxIndex);
            int leftChildIndex = (index << 1) + 1;
            if (leftChildIndex > maxIndex) {
                return;
            }
            int rightChildIndex = leftChildIndex + 1;
            int maxChildIndex = rightChildIndex <= maxIndex && nums[rightChildIndex] > nums[leftChildIndex] ? rightChildIndex : leftChildIndex;
            if (nums[maxChildIndex] < nums[index]) {
                return;
            }
            System.out.println(maxChildIndex + " " + index);
            swap(nums, maxChildIndex, index);
            headAdjust(nums, maxChildIndex, maxIndex);


        }

        public void swap(int[] nums, int left, int right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }

    }

    public static void main1(String[] args) {

//        byte aaa = 77;
//        String str = String.valueOf(aaa);
//        System.out.println("str:" + str);
//        String aa = "23";
//        System.out.println(aa.intern());
//        System.out.println("#######");
        ;
        /*
        * int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2, 4, 5, 6, 7, 8, 9, 10};
        Demo test = new Demo();
        System.out.println(test.findMedianSortedArrays(nums1, nums2));
        System.out.println();
        int[] nums = {16, 7, 3, 20, 17, 8};
        for (int num : nums) {
            System.out.print(num + " ");
        }
        headSort(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
        Demo test = new Demo();

        System.out.println("***************");
        System.out.println(test.times2(10));*/
//        int b = 4 - 1;
//        int a = 20;
//        System.out.println(Integer.toBinaryString(a));
//        System.out.println(Integer.toBinaryString(b));
//        System.out.println(a & b);
//        System.out.println(new BigInteger("7FFFFFFF", 16));
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
