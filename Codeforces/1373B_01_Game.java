import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int countZero = 0;
            int countOne = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    countZero++;
                } else {
                    countOne++;
                }
            }
            int count = Math.min(countZero, countOne);
            if (count % 2 != 0) {
                System.out.println("DA");
            } else {
                System.out.println("NET");
            }
        }
        sc.close();
    }
}