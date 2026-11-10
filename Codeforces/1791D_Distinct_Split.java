import java.util.*;
 
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            String st = sc.next();
            int[] fwd = new int[n];
            int[] bwd = new int[n];
 
            boolean[] vis = new boolean[26];
 
            int uni = 0;
 
            for (int i = 0; i < n-1; i++) {
                int curr = st.charAt(i) - 'a';
                if (!vis[curr]) {
                    vis[curr] = true;
                    uni++;
                }
                fwd[i] = uni;
            }
            for (int i = 0; i < vis.length; i++) {
                vis[i] = false;
            }
            uni = 0;
            for (int i = n-1; i > 0; i--) {
                int curr = st.charAt(i) - 'a';
                if (!vis[curr]) {
                    vis[curr] = true;
                    uni++;
                }
                bwd[i] = uni;
            }
 
            int max = 0;
 
            for (int i = 0; i < n-1; i++) {
                max = Math.max(fwd[i] + bwd[i+1], max);
            }
            System.out.println(max);
        }
        sc.close();
    }
}