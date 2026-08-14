class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int[] freqArr = new int[128];
        int count = 0;
        int j = 0;

        for (int i = 0; i < n; i++) {
            int ch = s.charAt(i) - 'a';
            freqArr[ch]++;
            if (freqArr[ch] > 2) {
                while (freqArr[ch] > 2) {
                    freqArr[s.charAt(j) - 'a']--;
                    j++;
                }
            } else {
                count = Math.max(count, i-j+1);
            }              
        }
        return count;
    }
}