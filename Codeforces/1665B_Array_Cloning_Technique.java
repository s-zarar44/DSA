import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
 
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
 
            for (int i = 0; i < n; i++) {
                int curr = sc.nextInt();
                if (!map.containsKey(curr)) {
                    map.put(curr, 1);
                } else {
                    map.put(curr, map.get(curr)+1);
                }
            }
 
            int maxFreq = Collections.max(map.values());
            int remaining = n - maxFreq;
 
            if (remaining == 0) {
                System.out.println(0);
                continue;
            }
 
            double op = Math.log((double) n / maxFreq) / Math.log(2);
 
            int ans = (int) Math.ceil(op) + remaining;
            System.out.println(ans);
        }
    }
}