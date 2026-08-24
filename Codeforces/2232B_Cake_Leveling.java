import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k = 1; k <= t; k++) {
            int n = sc.nextInt();
            long[] heights = new long[n];
            for (int j = 0; j < n; j++) {
                heights[j] = sc.nextInt();
            }
            long[] ans = new long[n];
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    ans[i] = heights[i];
                    continue;
                }
                if (heights[i] >= ans[i-1]) {
                    ans[i] = ans[i-1];
                    long excess = heights[i] - ans[i-1];
                    if (i+1 < n) heights[i+1] += excess;
                } else {
                    int e = i;
                    long h = ((e * ans[i-1]) + heights[i]) / (e + 1);
                    ans[i] = h;
 
                    long sum = e * ans[i-1] + heights[i];
                    long excess = sum - (e+1) * ans[i];
                    if (i+1 < n) heights[i+1] += excess;
                }
            }
            for (long height : ans) {
                System.out.print(height + " ");
            }
            System.out.println();
        }
    }
}