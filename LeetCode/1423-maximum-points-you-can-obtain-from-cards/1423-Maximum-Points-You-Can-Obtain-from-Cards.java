class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int i = cardPoints.length-1;
        int j = k-1;
        
        int max = 0;
        int sum = 0;
        for (int l = 0; l <= j; l++) {
            sum += cardPoints[l];
        }
        max = Math.max(max, sum);
        while (j >= 0) {
            sum = sum - cardPoints[j] + cardPoints[i];
            max = Math.max(max, sum);
            j--;
            i--;
        }

        return max;
    }
}