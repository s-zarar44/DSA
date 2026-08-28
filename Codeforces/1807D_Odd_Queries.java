import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 1; test <= t; test++) {
            int n = sc.nextInt();
            int q = sc.nextInt();
 
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                int curr = sc.nextInt();
                if (i == 0) {
                    arr[i] = curr;
                    continue;
                }
                arr[i] = curr + arr[i-1];
            }
 
            for (int i = 0; i < q; i++) {
                int l = sc.nextInt() - 1;
                int r = sc.nextInt() - 1;
                int k = sc.nextInt();
 
                int totalSum = arr[n-1];
 
                int prefixSum = 0;
                if (l > 0) prefixSum = arr[l-1];
                int suffixSum = totalSum - arr[r];
                int betweenSum = k * (r-l+1);
 
                if (((prefixSum + betweenSum + suffixSum) & 1) == 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}