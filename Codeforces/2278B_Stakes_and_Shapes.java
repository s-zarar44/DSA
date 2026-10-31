import java.util.Scanner;
 
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            StringBuilder ans = new StringBuilder();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
 
            int max = Math.max(x, Math.max(y, z));
            if (x == max) {
                for (int i = 0; i < x+y+z; i++) {
                    ans.append("P");
                }
            }
            else if (y == max) {
                for (int i = 0; i < x+y+z; i++) {
                    ans.append("R");
                }
            }
            else if (z == max) {
                for (int i = 0; i < x+y+z; i++) {
                    ans.append("S");
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}