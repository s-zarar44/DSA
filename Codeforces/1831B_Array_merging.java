import java.util.*;
 
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
 
            int[] freqa = new int[2*n+1];
            int[] freqb = new int[2*n+1];
 
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
 
            int i = 0;
            while (i < n) {
                int curr = a[i];
                int count = 1;
                while (i+1 < n && a[i+1] == curr) {
                    count++;
                    i++;
                }
                freqa[curr] = Math.max(count, freqa[curr]);
                i++;
            }
            i = 0;
            while (i < n) {
                int curr = b[i];
                int count = 1;
                while (i+1 < n && b[i+1] == curr) {
                    count++;
                    i++;
                }
                freqb[curr] = Math.max(count, freqb[curr]);
                i++;
            }
 
            int max = 0;
 
            for (i = 0; i < freqa.length; i++) {
                max = Math.max(max, freqa[i] + freqb[i]);
            }
            System.out.println(max);
        }
        sc.close();
    }
}