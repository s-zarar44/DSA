import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 1; test <= t; test++) {
            int n = sc.nextInt();
           String s = sc.next();
           int count = 0;
           for (int i = 0; i < n; i++) {
               if (s.charAt(i) == '#') continue;
               if (i > 0 && i < n-1 && s.charAt(i-1) == '.' && s.charAt(i+1) == '.') {
                   count = 2;
                   break;
               }
               count++;
           }
           System.out.println(count);
        }
    }
}