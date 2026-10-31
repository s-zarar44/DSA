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
 
            if (n < m) {
                System.out.println("NO");
                continue;
            }
 
            int[] freq = new int[26];
            for (int i = 0; i < n; i++) {
                freq[p.charAt(i) - 'a']++;
            }
 
            for (int i = 0; i < m; i++) {
                freq[q.charAt(i) - 'a']--;
            }
            boolean possible = false;
 
            if (freq['s' - 'a'] == 1 && freq['i' - 'a'] == 1 && freq['x' - 'a'] == 1) {
                possible = true;
            }
 
            for (int i = 0; i < 26; i++) {
                if (i == 's' - 'a' || i == 'i' - 'a' || i == 'x' - 'a') continue;
                if (freq[i] != 0) {
                    possible = false;
                    break;
                }
            }
 
            if (possible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}