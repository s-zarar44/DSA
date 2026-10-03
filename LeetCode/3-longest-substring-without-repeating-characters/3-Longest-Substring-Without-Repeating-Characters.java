class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int i = 0;
        int j = 0;
        int len = 0;

        int[] vis = new int[128];

        while (j < n && i < n) {
            if (vis[s.charAt(j)] == 0) {
                vis[s.charAt(j)] = 1;
                len = Math.max(len, j-i+1);
                j++;
            } else {
                vis[s.charAt(i)] = 0;
                i++;
            }
        }
        return len;
    }
}