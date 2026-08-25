import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 1; test <= t; test++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
 
 
            long time = b;
 
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x < a) {
                    time += x;
                } else {
                    time += a - 1;
                }
            }
 
            System.out.println(time);
        }
    }
}