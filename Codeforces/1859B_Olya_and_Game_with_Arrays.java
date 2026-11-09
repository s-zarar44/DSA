import java.util.*;
 
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            List<int[]> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int m = sc.nextInt();
                int[] curr = new int[m];
                for (int j = 0; j < m; j++) {
                    curr[j] = sc.nextInt();
                }
                list.add(curr);
            }
 
            long sum = 0;
 
            int[] minArr = new int[n];
            int[] secMinArr = new int[n];
            int i = 0;
 
            for (int[] arr : list) {
                int min = (int) 1e9;
                int secMin = (int) 1e9;
 
                for (int num : arr) {
                    if (num < min) {
                        secMin = min;
                        min = num;
                    } else if (num < secMin) secMin = num;
                }
                minArr[i] = min;
                secMinArr[i] = secMin;
                i++;
 
            }
            int min = (int) 1e9;
            int secMin = (int) 1e9;
 
            for (int j = 0; j < n; j++) {
                min = Math.min(minArr[j], min);
                secMin = Math.min(secMinArr[j], secMin);
            }
 
            for (int num : secMinArr) {
                sum += num;
            }
            sum = sum - secMin + min;
            System.out.println(sum);
        }
        sc.close();
    }
}