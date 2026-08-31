import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();
            StringBuilder sb = new StringBuilder(s);
 
            if (sb.charAt(0) != sb.charAt(n-1)) {
                sb.setCharAt(0, sb.charAt(n-1));
            }
 
            System.out.println(sb.toString());
        }
    }
}