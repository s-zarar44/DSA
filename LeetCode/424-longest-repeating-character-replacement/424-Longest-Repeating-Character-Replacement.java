class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int i = 0;
        int j = 0;

        int max = 0;
        int ans = 1;

        int[] freq = new int[26];

        while (j < n) {
            int curr = s.charAt(j) - 'A';
            freq[curr]++;

            max = Math.max(max, freq[curr]);
            int rem = (j-i+1) - max;

            if (rem > k) {
                int start = s.charAt(i) - 'A';
                freq[start]--;
                i++;

                rem = (j-i+1) - max;
            }

            ans = Math.max(ans, j-i+1);
            j++;
        }
        return ans;
    }
}