import java.util.Scanner;
public class Problem_1 {
    public static int hcf(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) a = a % b;
            else b = b % a;
        }
        if (a == 0) return b;
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 1; test <= t; test++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
 
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int hcf = 1;
            for (int i = 0; i < n; i++) {
                int diff = Math.abs(arr[i] - (i+1));
                if (i == 0) {
                    hcf = diff;
                    continue;
                }
                hcf = hcf(diff, hcf);
            }
            System.out.println(hcf);
        }
    }
}