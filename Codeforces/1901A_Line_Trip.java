import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 1; test <= t; test++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
 
            int[] gas = new int[n];
            for (int i = 0; i < n; i++) {
                gas[i] = sc.nextInt();
            }
            int diff = gas[0];
            for (int i = 1; i < n; i++) {
                diff = Math.max(diff, gas[i] - gas[i-1]);
            }
            diff = Math.max(diff, 2 * (x-gas[n-1]));
 
            System.out.println(diff);
        }
    }
}