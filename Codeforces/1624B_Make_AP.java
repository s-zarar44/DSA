import java.util.Scanner;
 
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
 
            if (2*b == a+c) {
                System.out.println("YES");
            } else if (2*b < a+c) {
                if ((a+c) % 2 == 0 && ((a+c)/2) % b == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                int b2 = 2 * b;
                if ((b2-a) % c == 0) {
                    System.out.println("YES");
                } else if ((b2-c) % a == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}