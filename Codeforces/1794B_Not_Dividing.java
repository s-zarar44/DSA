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
 
            for (int i = 0; i < n-1; i++) {
                if (arr[i] == 1) arr[i]++;
            }
            for (int i = 0; i < n-1; i++) {
                if (arr[i+1] % arr[i] == 0) arr[i+1]++;
            }
 
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}