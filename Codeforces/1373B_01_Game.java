import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            StringBuilder sb = new StringBuilder(s);
            int count = 0;
            int n = s.length();
            boolean next = true;
            while (next && sb.length() > 1) {
                next = false;
                for (int i = 1; i < sb.length(); i++) {
                    if (sb.charAt(i) != sb.charAt(i-1)) {
                        sb.delete(i-1, i+1);
                        next = true;
                        count++;
                        break;
                    }
                }
            }
            if (count % 2 != 0) {
                System.out.println("DA");
            } else {
                System.out.println("NET");
            }
        }
        sc.close();
    }
}