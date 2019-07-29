import java.util.Arrays;

/**
 * created by memory
 * on 2019/7/23 20 58
 */
class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        if (nums == null || k < 2 || nums.length < 2) {
            return false;
        }
        int sum = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            sum += nums[i];
        }
        if (!(sum % k != 0) || sum / k < max) {
            return false;
        }
        return backtracking(nums, k,k);
    }

    private boolean backtracking(int[] nums, int k,int target) {
        int[] formatNum = nums;
        boolean[] used = new boolean[formatNum.length];
        Arrays.sort(formatNum);
        int sum = 0;//组成了多少个子集
        for (int start = 0; start < nums.length; start++) {
            if (used[start]){

            }
        }

        return false;
    }
    private boolean findData(int[] nums,int target,int index, boolean[] used){
        return false;
    }
    /*
    private boolean backtracking(int[] nums, int k, int target, int cur, int start, boolean[] used) {
        // 返回条件
        if (k == 0) return true;
        if (cur == target) {
            // 构建下一个集合
            return backtracking(nums, k-1, target, 0, 0, used);
        }
        for (int i = start; i < nums.length; i++) {
            if (!used[i] && cur+nums[i] <= target) {
                used[i] = true;
                if (backtracking(nums, k, target, cur+nums[i], i+1, used)) return true;
                used[i] = false;
            }
        }
        return false;
    }

    public boolean canPartitionKSubsets(int[] nums, int k) {
        // 注意nums[i] > 0
        int sum = 0, maxNum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (maxNum < nums[i]) maxNum = nums[i];
        }
        if (sum % k != 0 || maxNum > sum/k) return false;
        boolean[] used = new boolean[nums.length];
        return backtracking(nums, k, sum/k, 0, 0, used);
    }*/
}