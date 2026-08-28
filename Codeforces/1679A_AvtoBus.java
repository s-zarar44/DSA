import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 1; test <= t; test++) {
            long n = sc.nextLong();
 
            if (n < 4 || n % 2 != 0) {
                System.out.println(-1);
            } else {
                long min = (n+5)/6;
                long max = n/4;
                
                System.out.println(min + " " + max);
            }
        }
    }
}