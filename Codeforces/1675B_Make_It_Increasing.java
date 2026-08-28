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
 
            int count = 0;
 
            for (int i = n-2; i >= 0; i--) {
                if (arr[i+1] == 0) {
                    count = -1;
                    break;
                }
                while (arr[i] >= arr[i+1]) {
                    arr[i] /= 2;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}