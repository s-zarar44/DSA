import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 1; test <= t; test++) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
            }
 
            if (n % 2 == 0) {
                System.out.println(2);
                System.out.println(1 + " " + n);
                System.out.println(1 + " " + n);
            } else {
                System.out.println(4);
                System.out.println(1 + " " + 2);
                System.out.println(1 + " " + 2);
                System.out.println(2 + " " + n);
                System.out.println(2 + " " + n);
            }
        }
    }
}