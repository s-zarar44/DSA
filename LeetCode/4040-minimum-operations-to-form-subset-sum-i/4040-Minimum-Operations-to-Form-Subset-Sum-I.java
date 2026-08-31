class Solution {
    public int rec(int[] nums, int i, int sum, int[][] dp) {
        if (i < 0) {
            if (sum == 0) {
                return 0;
            }
            return (int) 1e9;
        }

        if (dp[i][sum] != -1) return dp[i][sum];

        int ans = rec(nums, i-1, sum, dp);

        if (nums[i] <= sum) {
            ans = Math.min(ans, rec(nums, i-1, sum-nums[i], dp));
        }

        int op = 0;
        int curr = nums[i];

        while (curr < sum) {
            curr *= 2;
            op++;
            if (curr <= sum) {
                ans = Math.min(ans, op + rec(nums, i-1, sum-curr, dp));
            }
        }

        curr = nums[i];
        op = 0; 
         
        while (curr > 1) {
            curr /= 2;
            op++;
            if (curr <= sum) {
                ans = Math.min(ans, op + rec(nums, i-1, sum-curr, dp));
            }
        }

        return dp[i][sum] = ans;
    }
    public int minOperations(int[] nums, int sum) {
        int n = nums.length;
        int[][] dp = new int[n][sum+1];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        int ans = rec(nums, n-1, sum, dp);

        return ans >= 1e9 ? -1 : ans;
    }
}