import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            if (a < b) {
                long currDiff = Math.abs(a-b);
                long diff = Math.abs(a+c-b);
                if (diff > currDiff) {
                    System.out.println(diff);
                } else {
                    System.out.println(currDiff);
                }
            } else if (a == b) {
                System.out.println(c);
            } else {
                long diff = a + c - b;
                System.out.println(diff);
            }
        }
        sc.close();
    }
}