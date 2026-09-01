import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
 
            String num = Long.toString(n);
            StringBuilder sb = new StringBuilder(num);
            int l = num.length();
 
            int count  = 0;
            boolean found = false;
 
            for (int i = l-1; i >= 0; i--) {
                char ch = num.charAt(i);
 
                if (!found && ch == '5') {
                    found = true;
                    continue;
                } else if (found && (ch == '2' || ch == '7')) {
                    break;
                } else {
                    count++;
                }
            }
 
            int min = count;
            count = 0;
            found = false;
 
            for (int i = l-1; i >= 0; i--) {
                char ch = num.charAt(i);
 
                if (!found && ch == '0') {
                    found = true;
                } else if (found && (ch == '0' || ch == '5')) {
                    break;
                } else {
                    count++;
                }
            }
            min = Math.min(count, min);
 
            System.out.println(min);
        }
    }
}