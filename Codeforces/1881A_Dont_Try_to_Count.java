import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 1; test <= t; test++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
 
            String x = sc.next();
            String s = sc.next();
            int count = 0;
 
            while (!x.contains(s)) {
                if (count > 5) break;
                x += x;
                count++;
            }
 
            System.out.println(count <= 5 ? count : -1);
        }
    }
}