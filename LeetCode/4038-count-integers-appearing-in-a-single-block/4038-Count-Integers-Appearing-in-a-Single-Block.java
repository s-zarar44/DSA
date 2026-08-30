class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n = nums.length;
        int[] freq = new int[101];
        int i = 0;
        while (i < n) {
            int curr = nums[i];
            while (i < n && nums[i] == curr) {
                i++;
            }
            freq[curr]++;
        }

        int count = 0;
        for (int num : freq) {
            if (num == 1) count++;
        }
        return count;
    }
}