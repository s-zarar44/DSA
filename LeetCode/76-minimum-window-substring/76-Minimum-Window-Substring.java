class Solution {
    public String minWindow(String s, String t) {
        int n = s.length(), m = t.length();
        if (m > n) return "";

        int[] need = new int[128];
        for (char c : t.toCharArray()) need[c]++;

        int missing = m;
        int bestStart = 0, bestLen = n + 1;
        int i = 0;

        for (int j = 0; j < n; j++) {
            if (need[s.charAt(j)]-- > 0) missing--;

            while (missing == 0) {
                if (j - i + 1 < bestLen) {
                    bestLen = j - i + 1;
                    bestStart = i;
                }
                if (++need[s.charAt(i++)] > 0) missing++;
            }
        }
        return bestLen == n + 1 ? "" : s.substring(bestStart, bestStart + bestLen);
    }
}