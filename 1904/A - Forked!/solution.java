import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 1; test <= t; test++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
 
            int xk = sc.nextInt();
            int yk = sc.nextInt();
 
            int xq = sc.nextInt();
            int yq = sc.nextInt();
 
            int[][] moves = {
                    {a, b}, {a, -b}, {-a, b}, {-a, -b},
                    {b, a}, {b, -a}, {-b, a}, {-b, -a}
            };
 
            if (a == b) {
                int[][] newMoves = {
                        {a, b}, {a, -b}, {-a, b}, {-a, -b}
                };
                moves = newMoves;
            }
 
            int count = 0;
 
            for (int[] move : moves) {
                int x = xk + move[0];
                int y = yk + move[1];
 
                if ((Math.abs(x - xq) == a && Math.abs(y - yq) == b)
                        || (Math.abs(x - xq) == b && Math.abs(y - yq) == a)) {
                   count++;
                }
            }
            System.out.println(count);
        }
    }
}