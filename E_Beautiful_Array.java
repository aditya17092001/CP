import java.util.*;

public class E_Beautiful_Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int m = s.nextInt();
        solve(n, m);
    }

    public static void solve(int n, int m) {
        if(n == m) {
            System.out.println(1);
            System.out.println(n);
            return ;
        }

        int sum = 3 * n;
        
        int ans[] = new int[3];
        ans[0] = (sum-m-(m+3));
        ans[1] = m;
        ans[2] = (m+3);
        
        Arrays.sort(ans);

        System.out.println(3);
        if(m == ans[1]) System.out.println(ans[0]+" "+ans[1]+" "+ans[2]);
        else {
            if(ans[0] == m) {
                int diff = ans[1] - ans[0];
                ans[1] -= diff;
                ans[2] += diff;
            } 
            System.out.println(ans[0]+" "+ans[1]+" "+ans[2]);
        }
        
    }
}