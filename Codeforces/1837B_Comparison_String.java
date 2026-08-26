import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 1; test <= t; test++) {
            int n = sc.nextInt();
            String s = sc.next();
 
            int count = 0;
            int max  = 0;
            int curr = s.charAt(0);
            for (char ch : s.toCharArray()) {
                if (ch == curr) count++;
                else {
                    max = Math.max(max, count);
                    curr = ch;
                    count = 1;
                }
            }
            max = Math.max(max, count);
            System.out.println(max+1);
        }
    }
}