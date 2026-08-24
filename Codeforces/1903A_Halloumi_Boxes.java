import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 1; test <= t; test++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
 
            boolean sorted = true;
 
            int[] box = new int[n];
            for (int i = 0; i < n; i++) {
                box[i] = sc.nextInt();
            }
            if (k == 1) {
                for (int i = 1; i < n; i++) {
                    if (box[i-1] > box[i]) {
                        sorted = false;
                        break;
                    }
                }
            }
            System.out.println(sorted ? "YES" : "NO");
        }
    }
}