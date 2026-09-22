import java.util.Scanner;
 
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int min = 10;
            int countEven = 0;
 
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                int rem = num % k;
                if (rem == 0) {
                    min = 0;
                }
                min = Math.min(min, k - rem);
                if (num % 2 == 0) countEven++;
            }
 
            if (k == 4) {
                int min2;
                if (n == 1) {
                    min2 = (int) 1e9;
                } else if (countEven >= 2) {
                    min2 = 0;
                } else if (countEven == 1) {
                    min2 = 1;
                } else {
                    min2 = 2;
                }
                System.out.println(Math.min(min, min2));
            } else {
                System.out.println(min);
            }
        }
        sc.close();
    }
}