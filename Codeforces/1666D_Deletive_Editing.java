import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int test = 1; test <= n; test++) {
 
            String s = sc.next();
            String t = sc.next();
 
            int[] freqS = new int[26];
            int[] freqT = new int[26];
 
            for (int i = 0; i < s.length(); i++) {
                freqS[s.charAt(i) - 'A']++;
            }
 
            for (int i = 0; i < t.length(); i++) {
                freqT[t.charAt(i) - 'A']++;
            }
 
            int i = 0;
 
            while (i < s.length()) {
                int ind = s.charAt(i) - 'A';
                if (freqS[ind] > freqT[ind]) {
                    freqS[ind]--;
                    s = s.replaceFirst(s.charAt(i) + "", "");
                } else {
                    i++;
                }
            }
 
            System.out.println(t.contentEquals(s) ? "YES" : "NO");
        }
    }
}