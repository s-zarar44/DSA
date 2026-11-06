import java.util.*;
 
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
 
            if (l > 0 && r > 0) System.out.println(r-l);
            else if (l < 0 && r < 0) System.out.println(r-l);
            else if (Math.abs(r) == Math.abs(l)) System.out.println(0);
            else if ((l == 0) || (r == 0)) System.out.println(r-l-1);
            else if (Math.abs(r) > Math.abs(l)) System.out.println(Math.abs(r)-Math.abs(l)-1);
            else if (Math.abs(r) < Math.abs(l)) System.out.println(Math.abs(l)-Math.abs(r)-1);
        }
        sc.close();
    }
}