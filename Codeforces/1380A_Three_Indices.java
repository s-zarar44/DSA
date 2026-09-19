import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
 
            int[] arr = new int[n+1];
            for (int i = 1; i <= n; i++) {
                arr[i] = sc.nextInt();
            }
            boolean present = false;
            boolean secPresent = false;
            for (int i = 3; i <= n; i++) {
                if (arr[i-2] < arr[i-1] && arr[i-1] > arr[i]) {
                    present = true;
                    int first = i-2;
                    int second = i-1;
                    int third = i;
                    System.out.println("Yes");
                    System.out.println(first + " " + second + " " + third);
                    break;
                }
            }
            if (!present) {
                System.out.println("No");
            }
        }
        sc.close();
    }
}