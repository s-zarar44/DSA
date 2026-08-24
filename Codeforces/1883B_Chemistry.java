import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 1; test <= t; test++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
 
            String s = sc.next();
 
            int[] freq = new int[26];
 
            for (int i = 0; i < n; i++) {
                freq[s.charAt(i) - 'a']++;
            }
            int count = 0;
            for (int num : freq) {
                if (num % 2 == 1) count++;
            }
            if (count - 1 <= k) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}