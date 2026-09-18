import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long x = sc.nextLong();
 
            long min = 0;
            long max = 0;
 
            for (int i = 0; i < n; i++) {
                long num = sc.nextLong();
                min += num;
                max += (num + x - 1) / x;
            }
 
            min = (min + x - 1) / x;
 
            System.out.println(min + " " + max);
        }
        sc.close();
    }
}