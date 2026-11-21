class Solution {
    public String[] assignUmbrella(int[] rain) {
        int n = rain.length;
        int acount = 0;
        int bcount = 0;

        String[] ans = new String[n];

        for (int i = 0; i < n; i++) {
            if (rain[i] == 1) {
                if (i + 1 < n && rain[i+1] == 1 && acount <= bcount) {
                    ans[i] = "Alice";
                    acount++;
                } else {
                    ans[i] = "Bob";
                    bcount++;
                }
            } else {
                ans[i] = "None";
            }
        }
        return ans;
    }
}