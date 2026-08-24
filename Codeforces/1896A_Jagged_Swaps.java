import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 1; test <= t; test++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
 
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
 
            boolean isPossible = true;
 
            for (int num : arr) {
                if (num < arr[0]) {
                    isPossible = false;
                    break;
                }
            }
            System.out.println(isPossible ? "YES" : "NO");
        }
    }
}