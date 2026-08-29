import java.util.Scanner;
 
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long x0 = sc.nextLong();
            long n = sc.nextLong();
 
            if (x0 % 2 == 0) {
                if (n % 4 == 0) {
                    System.out.println(x0);
                } else if (n % 4 == 1) {
                    System.out.println(x0-n);
                } else if (n % 4 == 2) {
                    System.out.println(x0+1);
                } else {
                    System.out.println(x0+n+1);
                }
            } else {
                if (n % 4 == 0) {
                    System.out.println(x0);
                } else if (n % 4 == 1) {
                    System.out.println(x0+n);
                } else if (n % 4 == 2) {
                    System.out.println(x0-1);
                } else {
                    System.out.println(x0-n-1);
                }
            }
        }
    }
}