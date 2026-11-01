class Solution {
    public int minMergedInteger(int[] nums) {
        int n = nums.length/2;
        int min = (int) 1e8;
        for (int i = 0; i < 2*n; i+=2) {
            Integer first = nums[i];
            Integer sec = nums[i+1];

            int curr = Integer.parseInt(first.toString() + sec.toString());
            min = Math.min(min, curr);
        }
        return min;
    }
}