import java.util.Scanner;
 
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        while (n-- > 0) {
            String s = sc.next();
            String t = sc.next();
 
            int[] freqS = new int[26];
            int[] freqT = new int[26];
 
            for (char ch : s.toCharArray()) {
                freqS[ch - 'A']++;
            }
 
            for (char ch : t.toCharArray()) {
                freqT[ch - 'A']++;
            }
 
            boolean possible = true;
 
            for (int i = 0; i < 26; i++) {
                if (freqS[i] < freqT[i]) {
                    possible = false;
                    break;
                }
            }
 
            if (!possible) {
                System.out.println("NO");
                continue;
            }
 
            int[] remove = new int[26];
 
            for (int i = 0; i < 26; i++) {
                remove[i] = freqS[i] - freqT[i];
            }
 
            StringBuilder remaining = new StringBuilder();
 
            for (char ch : s.toCharArray()) {
                int idx = ch - 'A';
 
                if (remove[idx] > 0) {
                    remove[idx]--;
                } else {
                    remaining.append(ch);
                }
            }
 
            System.out.println(remaining.toString().equals(t) ? "YES" : "NO");
        }
 
        sc.close();
    }
}