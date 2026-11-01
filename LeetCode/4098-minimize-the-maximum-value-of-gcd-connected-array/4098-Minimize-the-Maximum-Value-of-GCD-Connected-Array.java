class Solution {
    public long minimumMaxValue(int n, int index, int value) {
        if (value == 1) return -1;
        long rem = n - index - 1;
        if (value % 2 == 0) {
            if (value < 2 * (index + 1)) return -1;
            return (long) value + 2 * rem;
        }
        long fac = value;
        for (int i = 3; (long) i * i <= value; i += 2) {
            if (value % i == 0) {
                fac = i;
                break;
            }
        }
        if (value < 2*(index)+fac) return -1;
        if (rem == 0) return value;
        return value + fac + 2 * (rem - 1);
    }
}