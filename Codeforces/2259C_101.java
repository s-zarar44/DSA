import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
 
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
 
            int i = 0;
            while (i < n && arr[i] == 0) {
                i++;
            }
            if (i == n) {
                for (int num : arr) {
                    System.out.print(num + " ");
                }
                System.out.println();
                continue;
            }
            int lastIndex = i;
            boolean begun = false;
 
            while (i < n) {
                int num = arr[i];
                if (arr[i] == -1 && !begun) {
                    arr[i] = 1;
                    lastIndex = i;
                    begun = true;
                } else if (arr[i] == -1){
                    arr[i] = 0;
                    lastIndex = i;
                } else if (arr[i] == 1 && !begun) {
                    lastIndex = i;
                    begun = true;
                } else if (arr[i] == 1) {
                    lastIndex = i;
                }
                i++;
            }
            if (arr[lastIndex] == 0) {
                arr[lastIndex] = 1;
            }
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}