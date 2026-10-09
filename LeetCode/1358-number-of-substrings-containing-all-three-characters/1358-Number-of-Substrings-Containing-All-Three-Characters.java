class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int[] freq = new int[3];

        int i = 0;
        int j = 0;
        int count = 0;
        int distinct = 0;

        while (j < n) {
            int curr = s.charAt(j) - 'a';
            if (freq[curr]++ == 0) distinct++;

            while (distinct == 3) {
                count += n - j;
                int start = s.charAt(i++) - 'a';
                if (--freq[start] == 0) distinct--;
            }
            j++;
        }
        return count;
    }
}