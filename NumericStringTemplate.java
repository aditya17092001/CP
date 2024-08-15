import java.util.*;

public class NumericStringTemplate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i = 0; i < t; i++) {
            int n = s.nextInt();
            int a[] = new int[n];
            for(int j = 0; j < n; j++) a[j] = s.nextInt();
            int m = s.nextInt();
            String b[] = new String[m];
            for(int j = 0; j < m; j++) b[j] = s.next();
            solve(a, b);
        }
    }

    public static void solve(int a[], String b[]) {
        for(int i = 0; i < b.length; i++) {
            String str = b[i];
            if(str.length() != a.length) {
                System.out.println("No");
                continue;
            }
            int taken[] = new int[26];
            HashMap<Integer, Character> m = new HashMap<>();
            boolean bol = true;
            for(int j = 0; j < a.length; j++) {
                char c = str.charAt(j);
                int n = a[j];
                if(m.containsKey(n)) {
                    if(c == m.get(n)) continue;
                    else bol = false;
                }
                else if(taken[(c-'a')] == 0) {
                    taken[c-'a'] = 1;
                    m.put(n, c);
                }
                else if(taken[(c-'a')] == 1) bol = false;
                if(!bol) break;
            }
            if(bol) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
