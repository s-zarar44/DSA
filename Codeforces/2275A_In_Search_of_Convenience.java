import java.util.*;
 
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int x0 = sc.nextInt();
            int y0 = sc.nextInt();
            int rad = sc.nextInt();
 
            int x = x0;
            int y = y0 + rad;
 
            System.out.println(x + " " + y);
        }
    }
}