import java.util.*;

public class C_Assembly_via_Remainders{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int a[] = new int[n-1];
            for(int i = 0; i < n-1; i++) a[i] = s.nextInt();
            solve(n, a);
        }
    }

    public static void solve(int n, int a[]) {
        long ans[] = new long[n];
        ans[0] = 10000;
        for(int i = 1; i < n; i++) ans[i] = ans[i-1]+a[i-1];
        for(long i: ans) System.out.print(i+" ");
        System.out.println();
    } 
}

