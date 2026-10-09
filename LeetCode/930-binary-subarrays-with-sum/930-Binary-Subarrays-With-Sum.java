class Solution {
    public int countSubarrays(int[] nums, int goal) {
        if (goal < 0) return 0;
        int n = nums.length;
        int i = 0;
        int j = 0;
        
        int count = 0;
        int sum = 0;

        while (j < n) {
            int curr = nums[j];
            sum += curr;

            while (sum > goal) {
                sum -= nums[i++];
            }
            count += j-i+1;
            j++;
        }
        return count;
    }

    public int numSubarraysWithSum(int[] nums, int goal) {
        return countSubarrays(nums, goal) - countSubarrays(nums, goal-1);
    }
}