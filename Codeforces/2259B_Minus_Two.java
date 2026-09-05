import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int oddCount = 0;
            int even4n = 0;
            int even4n2 = 0;
 
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                if (num % 2 == 1) oddCount++;
                else if (num % 4 == 0)  even4n++;
                else even4n2++;
            }
 
            int ans = Math.max(oddCount, Math.max(even4n2, even4n));
 
            System.out.println(ans);
        }
    }
}