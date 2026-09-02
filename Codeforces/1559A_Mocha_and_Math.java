import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
 
            int bitAND = sc.nextInt();
 
            for (int i = 1; i < n; i++) {
                int num = sc.nextInt();
                bitAND &= num;
            }
 
            System.out.println(bitAND);
        }
    }
}