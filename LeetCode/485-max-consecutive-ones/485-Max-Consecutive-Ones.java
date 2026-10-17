class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int i = 0;
        int count = 0;
        int max = 0;

        while (i < n) {
            if (nums[i] == 0) {
                max = Math.max(count, max);
                count = 0;
            } else {
                count++;
            }
            i++;
        }
        max = Math.max(count, max);
        return max;
    }
}