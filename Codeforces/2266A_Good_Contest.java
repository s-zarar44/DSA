import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int min = 10;
            for (int i = 0; i < 3; i++) {
                int num = sc.nextInt();
                min = Math.min(num, min);
            }
            System.out.println(n-min);
        }
        sc.close();
    }
}