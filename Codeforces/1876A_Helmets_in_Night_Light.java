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
                list.add(new Tuple(sc.nextInt(), 0, false));
            }
            for (int i = 0; i < n; i++) {
                list.get(i).second = sc.nextInt();
            }
            list.sort(Comparator.comparingInt(k -> k.second));
 
            if (p <= list.get(0).second) {
                System.out.println((long) p*n);
                continue;
            }
            int count = 0;
            long totalCost = 0;
 
            for (int i = 0; i < n; i++) {
                if (!list.get(i).vis && count + 1 <= n) {
                    count += 1;
                    totalCost += p;
                    list.get(i).vis = true;
                }
                if (count == n) break;
 
                int req = n - count;
                int resi = list.get(i).first;
                int cost = list.get(i).second;
 
                if (cost > p) {
                    totalCost += (long) p*req;
                     break;
                }
 
                if (req >= resi) {
                    count += resi;
                    totalCost += (long) resi * cost;
                    for (int j = i+1; j <= i+resi; j++) {
                        list.get(j).vis = true;
                    }
                } else {
                    count += req;
                    totalCost += (long) req * cost;
                }
                if (count == n) break;
            }
            System.out.println(totalCost);
        }
        sc.close();
    }
 
    private static class Tuple {
        int first;
        int second;
        boolean vis;
 
        public Tuple(int first, int second, boolean vis) {
            this.first = first;
            this.second = second;
            this.vis = vis;
        }
    }
}