import java.util.Scanner;
 
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
 
            if (s.charAt(0) == '1') {
                int countZero = 0;
                for (int i = 1; i < n; i++) {
                    if (s.charAt(i) == '0') countZero++;
                }
                sb.append(countZero).append('\n');
            } else {
                int p = s.indexOf('1');
                if (p == -1) {
                    sb.append(0).append('\n');
                    continue;
                }
 
                int totalZeros = 0;
                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == '0') totalZeros++;
                }
 
                int best = Integer.MAX_VALUE;
                int onesPrefix = 0;
                int zerosPrefix = 0;
                
                for (int k = 0; k <= n; k++) {
                    if (k >= p) {
                        int cost = onesPrefix + (totalZeros - zerosPrefix);
                        best = Math.min(best, cost);
                    }
                    if (k < n) {
                        if (s.charAt(k) == '1') onesPrefix++;
                        else zerosPrefix++;
                    }
                }
                sb.append(best).append('\n');
            }
        }
 
        System.out.print(sb);
        sc.close();
    }
}