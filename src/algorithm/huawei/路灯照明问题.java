package algorithm.huawei;

import java.util.Scanner;

/**
 * description:memory
 *
 * @author xiaozhenzhen001
 * @date 2022/7/24
 */
public class 路灯照明问题 {

    // 获取输入并转成数组
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];




        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        int res = 0;
        // 左右均给辐射到

        for (int i = 1; i < nums.length; i++) {
            // 向左辐射
            if (nums[i] < 100) {
                continue;
            }
            int leftLight = nums[i] - 100, leftIndex = i - 1;

            while (leftLight > 100 && leftIndex >= 0) {
                nums[leftIndex] = Math.max(nums[leftIndex], leftLight);
                leftLight -= 100;
                --leftIndex;
            }
            int rightLight = nums[i] - 100, rightIndex = i + 1;
            while (rightLight > 100 && rightIndex < nums.length) {
                nums[rightIndex] = Math.max(nums[rightIndex], rightLight);
                rightLight -= 100;
                ++rightIndex;
            }

        }

        // 考虑跨路灯照明问题
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] + nums[i - 1] >= 100) {
                continue;
            }
            res += (100 - nums[i] - nums[i - 1]);

        }
        System.out.println(res);
    }
}
