import java.util.Arrays;
import java.util.Scanner;
 
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            long sum = 0;
 
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                nums[i] = num;
            }
 
            Arrays.sort(nums);
            int mid = n%2 == 0 ? n/2 -1 : n/2;
            int median = nums[mid];
 
            for (int i = 0; i < n; i++) {
                sum += Math.abs(nums[i] - median);
            }
            int op = nums[n-1] - nums[0];
 
            System.out.println(sum + " " + op);
        }
        sc.close();
    }
}