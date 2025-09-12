import java.util.*;

public class C_Even_Larger {
    public static void main(String args[]) {
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
        long ans = 0;

        for(int i = 1; i < n; i+=2) {
            if(a[i] < a[i-1]) {
                ans += a[i-1] - a[i];
                a[i-1] = a[i];
            } 
            if(i+1 <= n-1 && a[i] < a[i+1]) {
                ans += a[i+1] - a[i];
                a[i+1] = a[i];
            }
        }

        for(int i = 1; i < n; i+=2) {
            if(i+1 <= n-1 && a[i-1]+a[i+1] > a[i]) {
                long diff = (a[i-1]+a[i+1]) - a[i];
                ans += diff;
                if(a[i+1] - diff >= 0) a[i+1] -= diff;
                else if(a[i-1] - diff >= 0) a[i-1] -= diff;
                else System.out.println("HI");
            }
        }

        // for(long i: a) System.out.print(i+" ");
        System.out.println(ans);
    }
}