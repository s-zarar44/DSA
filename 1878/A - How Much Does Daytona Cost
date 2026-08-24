import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 1; test <= t; test++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
 
            int[] arr = new int[n];
            boolean isCommon = false;
 
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (!isCommon && arr[i] == k) isCommon = true;
            }
 
            System.out.println(isCommon ? "Yes" : "NO");
        }
    }
}