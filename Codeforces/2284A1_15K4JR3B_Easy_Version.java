import java.util.*;
 
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int first = n/2;
            int sec = n-first;
 
            System.out.println(first*sec);
        }
        sc.close();
    }
}