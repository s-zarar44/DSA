import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
 
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
 
            String p = sc.next();
            String q = sc.next();
 
            q = q + "six";
            char[] newp = p.toCharArray();
            char[] newq = q.toCharArray();
 
            Arrays.sort(newp);
            Arrays.sort(newq);
 
            if (newp.length != newq.length) {
                System.out.println("NO");
                continue;
            }
 
            boolean possible = true;
 
            for (int i = 0; i < n; i++) {
                if (newp[i] != newq[i]) {
                    possible = false;
                    break;
                }
            }
 
            if (possible) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}