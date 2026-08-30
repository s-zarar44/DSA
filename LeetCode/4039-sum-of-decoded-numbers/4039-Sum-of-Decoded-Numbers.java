class Solution {
    static final long MOD = 1000000007;
    
    private long power(long x, long y) {
        long result = 1;
        x %= MOD;

        while (y > 0) {
            if ((y & 1) == 1) {
                result = (result * x) % MOD;
            }

            x = (x * x) % MOD;
            y >>= 1;
        }

        return result;
    }
    public int sumDecoded(long[] nums) {
        int n = nums.length;
        long sum = 0;

        for (long num : nums) {
            int width = (int) (num % 10);
            long d = num / 10;

            String di = Long.toString(d);

            long x = Long.parseLong(di.substring(0, width));
            long y = Long.parseLong(di.substring(width));

            sum = (sum + power(x, y)) % MOD;
        }

        return (int) sum;
    }
}