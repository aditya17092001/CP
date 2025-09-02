import java.util.*;

public class B_Array_Craft { 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int x = s.nextInt();
            int y = s.nextInt();

            solve(n, x, y);
        }
    }

    public static void solve(int n, int x, int y) {
        ArrayList<Integer> ans = new ArrayList<>();
        int count = 0;
        for(int i = y-1; i > 0; i--) {
            ans.add(((count&1) == 0) ? -1 : 1);
            count++;
        }
        Collections.reverse(ans);
        for(int i = y; i <= x; i++) ans.add(1);
        count = 0;
        for(int i = x+1; i <= n; i++) {
            ans.add(((count&1) == 0) ? -1 : 1);
            count++;
        }
        for(int i: ans) System.out.print(i+" ");
        System.out.println();
    }
}