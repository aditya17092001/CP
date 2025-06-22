import java.util.*;

public class B_Move_to_the_End{
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
        long suffix[] = new long[n];
        long max[] = new long[n];
        
        suffix[n-1] = a[n-1];
        for(int i = n-2; i >= 0; i--) suffix[i] = suffix[i+1] + a[i];

        max[0] = a[0];
        for(int i = 1; i < n; i++) max[i] = Math.max(a[i], max[i-1]);
        System.out.print(max[n-1]+" ");
        for(int i = n-1; i > 0; i--) System.out.print(max[i-1]+suffix[i]+" ");
        System.out.println();
    }
}

