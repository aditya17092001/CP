import java.util.*;

public class B_Progressive_Square{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
           int n = s.nextInt();
           int c = s.nextInt();
           int d = s.nextInt();
           int a[] = new int[n*n];
           for(int i = 0; i < a.length; i++) a[i] = s.nextInt();
           solve(n, a, c, d);
        }
    }

    public static void solve(int n, int a[], int c, int d) {
        int min = Integer.MAX_VALUE;
        HashMap<Integer, Integer> m = new HashMap<>();
        for(int i: a) {
            min = Math.min(min, i);
            m.put(i, m.getOrDefault(i, 0)+1);
        }

        // System.out.println(m);
        int ans[][] = new int[n][n];

        for(int t[]: ans) Arrays.fill(t, -1);
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == 0 && j == 0) {
                    ans[i][j] = min;
                    int val = m.get(min);
                    if(val == 1) m.remove(min);
                    else m.put(min, val-1);
                }
                if(ans[i][j] != -1) {
                    int down = ans[i][j]+c;
                    int right = ans[i][j]+d;
                    if(i+1 < n && ans[i+1][j] == -1 && m.containsKey(down)) {
                        ans[i+1][j] = down;
                        int val = m.get(down);
                        if(val == 1) m.remove(down);
                        else m.put(down, val-1);
                    }
                    if(j+1 < n && ans[i][j+1] == -1 && m.containsKey(right)) {
                        ans[i][j+1] = right;
                        int val = m.get(right);
                        if(val == 1) m.remove(right);
                        else m.put(right, val-1);          
                    }
                }
            }
        }

        // for(int t[]: ans) {
        //     for(int i: t) System.out.print(i+" ");
        //     System.out.println();
        // }

        // System.out.println(m);
        System.out.println((m.size() == 0 ? "YES" : "NO"));
    }
}

