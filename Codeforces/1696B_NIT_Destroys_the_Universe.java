import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 1; test <= t; test++) {
            int n = sc.nextInt();
 
            int count = 0;
            int i = 0;
 
            while (i < n) {
                int curr = sc.nextInt();
                if (curr != 0) {
                    count++;
                    i++;
                    while (i < n) {
                        int next = sc.nextInt();
                        if (next == 0) break;
                        i++;
                    }
                }
                i++;
            }
 
            if (count == 0) System.out.println(0);
            else if (count == 1) System.out.println(1);
            else System.out.println(2);
        }
    }
}