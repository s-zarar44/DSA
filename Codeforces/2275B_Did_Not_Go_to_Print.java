import java.util.*;
 
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
 
            Stack<Integer> st = new Stack<>();
            TreeSet<Integer> ans = new TreeSet<>();
 
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    st.push(i+1);
                } else if (s.charAt(i) == '2') {
                    if (!st.isEmpty()) {
                        st.pop();
                        ans.add(i+1);
                    }
                }
            }
            while (!st.isEmpty()) {
                ans.add(st.pop());
            }
            int rem = ans.size();
 
            System.out.println(rem);
 
            for (Integer val : ans) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}