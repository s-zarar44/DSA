import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 1; test <= t; test++) {
            int n = sc.nextInt();
 
            int[] arr = new int[n];
            int maxDiff = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
 
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                min = Math.min(min, arr[i]);
                max = Math.max(max, arr[i]);
                if (i == 0) continue;
                maxDiff = Math.max(maxDiff, arr[i-1] - arr[i]);
            }
 
            int ans = Math.max(maxDiff, Math.max(arr[n-1] - min, max - arr[0]));
 
            System.out.println(ans);
        }
    }
}