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
        return backtracking(nums, k, k);
    }

    private boolean backtracking(int[] nums, int k, int target) {
        int[] formatNum = nums;
        boolean[] used = new boolean[formatNum.length];
        Arrays.sort(formatNum);
        int sum = 0;//组成了多少个子集
        for (int start = 0; start < nums.length; start++) {
            if (used[start]) {

            }
        }

        return false;
    }

    private boolean findData(int[] nums, int target, int index, boolean[] used) {
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
    public static void main(String[] args) {
        int[] v = new int[]{0, 1, 4, 3};
        int[] w = new int[]{0, 2, 3, 4};
        int N = 3, V = 5;
        huisu(v, w, N, V);
        String s="89";
        s.compareTo("8");
    }

    private static void huisu(int[] v, int[] w, int N, int V) {
        int[][] dp = new int[N + 1][V + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= V; j++) {
                if (j >= v[i]) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - v[i]] + w[i]);

                } else {
                    dp[i][j] = dp[i - 1][j];

                }
            }
        }
    }

}