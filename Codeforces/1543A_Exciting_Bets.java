import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
 
            long diff = Math.abs(a-b);
            long op = 0;
 
            if (diff == 0 || diff == 1) {
                System.out.println(diff + " " + op);
                continue;
            }
            long rem = a % diff;
 
            op = Math.min(rem, diff - rem);
 
            System.out.println(diff + " " + op);
        }
    }
}