import java.util.*;
 
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
 
            int[] ans = new int[n];
            int ind = 0;
            for (int i = n - k; i < n; i++) ans[ind++] = arr[i];
            for (int i = n - k - 1; i >= 0; i--) ans[ind++] = arr[i];
 
            long sum = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if ((long) ans[i] * i >= sum) count++;
                sum += ans[i];
            }
 
            if (count == k) {
                System.out.println("YES");
                for (int i = 0; i < n; i++) {
                    System.out.print(ans[i] + " ");
                }
                System.out.println();
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}