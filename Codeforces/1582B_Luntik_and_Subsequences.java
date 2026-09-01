import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
 
            int zeroes = 0;
            int ones = 0;
 
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                if (num == 0) zeroes++;
                if (num == 1) ones++;
            }
 
            long zeroComb = 1L << zeroes;
 
            System.out.println(ones * zeroComb);
        }
    }
}