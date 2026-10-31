import java.util.Scanner;
 
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] cores = new int[n];
            boolean isPossible = false;
            long sum = 0;
 
            for (int i = 0; i < n; i++) {
                int core = sc.nextInt();
                cores[i] = core;
                sum += core;
            }
 
            for (int core : cores) {
                if (core > 1) {
                    isPossible = true;
                    break;
                }
            }
 
            if (!isPossible) {
                System.out.println(-1);
                continue;
            }
 
            boolean between = true;
            for (int i = 1; i < n-1; i++) {
                if (cores[i] > 1) {
                    between = false;
                }
            }
 
            if (n > 2 && between) System.out.println(sum - (n - 1));
            else System.out.println(sum-1);
        }
        sc.close();
    }
}