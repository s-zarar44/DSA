import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int count2 = 0;
            int count3 = 0;
 
            while (n > 1 && n % 3 == 0) {
                count3++;
                n /= 3;
            }
            while (n > 1 && n % 2 == 0) {
                count2++;
                n /= 2;
            }
            if (n > 1 || count3 < count2) {
                System.out.println(-1);
            } else {
                int moves = count2 + 2 * (count3-count2);
                System.out.println(moves);
            }
        }
        sc.close();
    }
}