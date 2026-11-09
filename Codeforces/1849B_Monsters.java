import java.util.*;
 
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
 
            HashMap<Integer, List<Integer>> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                int rem = num % k;
 
                if (rem == 0) rem = k;
 
                if (!map.containsKey(rem)) {
                    List<Integer> curr = new ArrayList<>();
                    curr.add(i);
                    map.put(rem, new ArrayList<>(curr));
                } else {
                    map.get(rem).add(i);
                }
            }
            List<Integer> ind = new ArrayList<>();
 
            TreeMap<Integer, List<Integer>> sortedTreeMap = new TreeMap<>(map);
            Map<Integer, List<Integer>> sortedMap = sortedTreeMap.descendingMap();
            for (List<Integer> list : sortedMap.values()) {
                ind.addAll(list);
            }
            for (int val : ind) {
                System.out.print(val+1 + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}