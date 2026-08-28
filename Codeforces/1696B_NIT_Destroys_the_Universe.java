import java.util.Scanner;
 
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
 
            int count = 0;
            boolean inSegment = false;
 
            for (int i = 0; i < n; i++) {
                int curr = sc.nextInt();
 
                if (curr == 0) {
                    inSegment = false;
                } else if (!inSegment) {
                    count++;
                    inSegment = true;
                }
            }
 
            if (count == 0)
                System.out.println(0);
            else if (count == 1)
                System.out.println(1);
            else
                System.out.println(2);
        }
    }
}