class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        int count = 0;
        HashMap<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);
        
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            int counter = sum - k;
            if (preSum.containsKey(counter)) {
                count += preSum.get(counter);
            }
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}