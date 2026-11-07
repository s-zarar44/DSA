class Solution {
    public int repeatedStringMatch(String a, String b) {
        String origA = a;
        String origB = b;
        
        int i = 1;

        while (a.length() < b.length()) {
            a += origA;
            i++;
        }
        if (a.contains(b)) return i;
        if ((a+origA).contains(b)) return i+1;
        return -1;
    }
}