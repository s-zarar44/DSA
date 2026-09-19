import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
 
            int[] arr = new int[n*k + 2];
            for (int i = 1; i <= n*k; i++) {
                arr[i] = sc.nextInt();
            }
            int s = 1;
            int e = arr.length-1;
 
            int medIndex = (n+2-1)/2;
            int fwd = medIndex-1;
            int bwd = n - fwd;
 
            long sum = 0;
 
            for (int i = 0; i < k; i++) {
                e -= bwd;
                sum += arr[e];
            }
 
            System.out.println(sum);
        }
        sc.close();
    }
}