class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }
        int max = 0;

        
        for (int num : set) {
            if (!set.contains(num-1)) {
                int currLen = 1;
                int curr = num;
                while (set.contains(curr + 1)) {
                    currLen++;
                    curr++;
                }
                max = Math.max(max, currLen);
            }
        }
        return max;
    }
}