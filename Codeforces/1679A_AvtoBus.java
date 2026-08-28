import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 1; test <= t; test++) {
            long n = sc.nextLong();
 
            if (n >= 4 && n % 2 == 0) {
 
                long min = 0;
                int rem6 = (int) (n % 6);
 
                if (rem6 == 2) {
                    min = (n-8)/6 + 2;
                } else if (rem6 == 4) {
                    min = (n-4)/6 + 1;
                } else {
                    min = n/6;
                }
 
                long max = 0;
                int rem4 = (int) (n % 4);
 
                if (rem4 == 2) {
                    max = (n-6)/4 + 1;
                } else {
                    max = n/4;
                }
 
                System.out.println(min + " " + max);
 
            } else {
                System.out.println(-1);
            }
        }
    }
}