import java.util.*;
 
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] love = new int[n];
            for (int i = 0; i < n; i++) {
                love[i] = sc.nextInt();
            }
 
            int m = n - 4;
 
            long[] sum = new long[m];
            for (int i = 0; i < m; i++) {
                sum[i] = (long) love[i] + love[i+2] - love[i+4];
            }
 
            HashMap<Long, Integer> freq = new HashMap<>();
            for (int i = 0; i < m; i++) {
                Integer c = freq.get(sum[i]);
                if (c == null) {
                    freq.put(sum[i], 1);
                } else {
                    freq.put(sum[i], c + 1);
                }
            }
 
            long count = 0;
            for (int val : freq.values()) {
                count += (long) val * (val - 1) / 2;
            }
 
            for (int i = 0; i + 2 < m; i++) {
                if (sum[i] == sum[i+2]) count--;
            }
            for (int i = 0; i + 4 < m; i++) {
                if (sum[i] == sum[i+4]) count--;
            }
 
            System.out.println(count);
        }
    }
}