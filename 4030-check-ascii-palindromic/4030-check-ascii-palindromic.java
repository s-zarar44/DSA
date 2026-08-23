class Solution {
    public boolean isPalindromic(String s) {
        
        StringBuilder bin = new StringBuilder();
        for (char ch : s.toCharArray()) {
            int ascii = (int) ch;
            bin.append(String.format("%8s", Integer.toBinaryString(ascii)).replace(' ', '0'));
        }

        String binaryStr = bin.toString();

        return binaryStr.equals(bin.reverse().toString());
    }
};