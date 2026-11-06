import java.util.*;
 
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            long b = 0;
            long h = 0;
 
            for (int i = n - 1; i >= 0; i--) {
                if (b <= h) b += 1L << arr[i];
                else h += 1L << arr[i];
            }
 
            System.out.println(b * h);
        }
        sc.close();
    }
}