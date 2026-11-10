import java.util.*;
public class Practice {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            long min = Integer.MAX_VALUE;
            int[] ans = {-1, -1};
            for (int i = 1; i*i <= n; i++) {
                if (n % i == 0) {
                    int first = i;
                    int a = Math.max(first, n-first);
                    int b = Math.min(first, n-first);
                    int gcd = gcd(a, b);
                    long lcm = ((long) a*b)/gcd;
                    if (lcm < min) {
                        min = lcm;
                        ans[0] = a;
                        ans[1] = b;
                    }
 
                    int sec = n/i;
                    if (sec == n) continue;
                    int c = Math.max(sec, n-sec);
                    int d = Math.min(sec, n-sec);
                    int gcdSec = gcd(c, d);
                    long lcmSec = ((long) c * d)/gcdSec;
                    if (lcmSec < min) {
                        min = lcmSec;
                        ans[0] = c;
                        ans[1] = d;
                    }
                }
            }
            System.out.println(ans[0] + " " + ans[1]);
        }
        sc.close();
    }
}