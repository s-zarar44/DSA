import java.util.*;
 
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int p = sc.nextInt();
 
            ArrayList<Tuple> list = new ArrayList<>();
 
            for (int i = 0; i < n; i++) {
                list.add(new Tuple(sc.nextInt(), 0));
            }
            for (int i = 0; i < n; i++) {
                list.get(i).second = sc.nextInt();
            }
            list.sort(Comparator.comparingInt(k -> k.second));
 
            if (p <= list.get(0).second) {
                System.out.println((long) p*n);
                continue;
            }
            int count = 1;
            long totalCost = p;
 
            for (int i = 0; i < n && count < n; i++) {
                if (list.get(i).second >= p) break;
                int take = Math.min(list.get(i).first, n-count);
                count += take;
                totalCost += (long) take * list.get(i).second;
            }
            totalCost += (long) p * (n-count);
            System.out.println(totalCost);
        }
        sc.close();
    }
 
    private static class Tuple {
        int first;
        int second;
 
        public Tuple(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}