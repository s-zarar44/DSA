import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 1; test <= t; test++) {
            int n = sc.nextInt();
 
            int first = sc.nextInt();
            int firstCount = 1;
            int second = -1;
            int secondCount = 0;
 
            boolean isGood = true;
 
            for (int i = 1; i < n; i++) {
                int curr = sc.nextInt();
 
                if (curr == first) firstCount++;
                else if (second == -1) {
                    second = curr;
                    secondCount++;
                } else if (curr == second) secondCount++;
                else isGood = false;
            }
 
            if ((isGood && Math.abs(firstCount - secondCount) < 2) || second == -1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}