class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0;
        int j = 0;

        int max = 0;
        int count = 0;
        
        outer:
        while (j < nums.length) {
            if (nums[j] == 0) {
                if (count == k) {
                    if (nums[i] == 0) {
                        count--;
                    }
                    i++;
                    continue outer;
                } else {
                    count++;
                }
            }
            max = Math.max(max, j-i+1);
            j++;
        }
        return max;
    }
}