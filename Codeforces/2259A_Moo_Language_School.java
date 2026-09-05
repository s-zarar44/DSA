import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
 
            String s = sc.next();
            int count = 0;
 
            int farms = n/k;
            for (int i = 0; i < farms; i++) {
                for (int j = k*i; j < k*i + k; j++) {
                    if (s.charAt(j) == '0') {
                        count++;
                        break;
                    }
                }
            }
 
            System.out.println(farms - count);
        }
    }
}