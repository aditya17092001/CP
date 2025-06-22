import java.util.*;

public class D_Retaliation{
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
        long diff = a[1] - a[0];

        for(int i = 2; i < n; i++) {
            if(diff != a[i] - a[i-1]) {
                System.out.println("NO");
                return;
            }
        }

        long forward = Integer.MAX_VALUE, backward = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            forward = Math.min(forward, (a[i]/(i+1)));
            backward = Math.min(backward, (a[i]/(n-i)));
        }

        // System.out.println(forward+", "+backward);
        for(int i = 0; i < n; i++) a[i] = (a[i] - ((i+1) * forward));

        diff = a[n-2] - a[n-1];

        for(int i = n-2; i >= 0; i--) {
            if(a[i]-a[i+1] != diff) {
                System.out.println("NO");
                return;
            }
        }

        // for(long i: a) System.out.print(i+" ");

        System.out.println("YES");
    } 
}

