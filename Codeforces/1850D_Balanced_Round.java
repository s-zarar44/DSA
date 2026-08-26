import java.util.Arrays;
import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 1; test <= t; test++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
 
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
 
            int max = 1;
            int count = 1;
 
            for (int i = 1; i < n; i++) {
                if (arr[i] - arr[i-1] > k) {
                    max = Math.max(max, count);
                    count = 1;
                } else {
                    count++;
                }
            }
            max = Math.max(max, count);
 
            System.out.println(n-max);
        }
    }
}