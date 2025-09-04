import java.util.*;

public class C_Basil_s_Garden{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            long a[] = new long[n];

            for(int i = 0; i < n; i++) a[i] = s.nextLong();

            solve(a, n);
        }
    }

    public static void solve(long a[], int n) {
        long ans = a[n-1], max = 0;

        for(int i = n-2; i >= 0; i--) {
            if(a[i] > a[i+1]) ans = Math.max(ans+1, a[i]);
            else ans++;
        }

        System.out.println(ans);
    }
}

