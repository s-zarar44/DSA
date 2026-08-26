import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 1; test <= t; test++) {
            long n = sc.nextLong();
            long i = 1;
            while (n % i == 0) {
                i++;
            }
            System.out.println(i-1);
        }
    }
}