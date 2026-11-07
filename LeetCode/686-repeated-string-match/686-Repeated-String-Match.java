class Solution {
    public int repeatedStringMatch(String a, String b) {
        int m = a.length();
        int n = b.length();
        int repeats = (m + n - 1) / m;
        
        StringBuilder sb = new StringBuilder(a.repeat(repeats));

        if (sb.indexOf(b) != -1) return repeats;
        if (sb.append(a).indexOf(b) != -1) return repeats+1;
        return -1;
    }
}