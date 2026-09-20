import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();
            int countZero = 0;
            int countOne = 0;
 
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') countZero++;
                else countOne++;
            }
 
            if (countZero == countOne) {
                System.out.println(0);
                continue;
            }
 
            int max = Math.max(countOne, countZero);
            int min = Math.min(countOne, countZero);
 
            char maxBit = '0';
            if (max == countOne) maxBit = '1';
 
            int count = 0;
            int i = 0;
            while (count <= min) {
                if (s.charAt(i) == maxBit) count++;
                i++;
            }
            System.out.println(n - i + 1);
        }
        sc.close();
    }
}