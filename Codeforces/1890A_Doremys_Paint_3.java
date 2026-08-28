import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 1; test <= t; test++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
 
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
 
            boolean isGood = true;
 
            int first  = arr[0];
            int second = arr[0];
 
            int count = 1;
 
            int i = 1;
 
            while (i < n && arr[i] == first) {
                count++;
                i++;
            }
            if (i != n) {
                second = arr[i];
                count--;
                for (int j = i+1; j < n; j++) {
                    if (arr[j] != first && arr[j] != second) {
                        isGood = false;
                        break;
                    } else if (arr[j] == first) {
                        count++;
                    } else if (arr[j] == second) {
                        count--;
                    }
                }
 
                if (isGood) {
                    if (Math.abs(count) < 2) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("YES");
            }
        }
    }
}