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
            int max = 0;
            for (int i = 0; i < n; i++) {
                int curr = arr[i];
                int count = 1;
                for (int j = i+1; j < n; j++) {
                    if (arr[j] % curr == 0) {
                        count++;
                    }
                }
                max = Math.max(max, count);
            }
            System.out.println(n-max);
        }
        sc.close();
    }
}