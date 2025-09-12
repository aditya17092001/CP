import java.util.*;

public class C_Boring_Day {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();

            int l = s.nextInt();
            int r = s.nextInt();

            long a[] = new long[n];

            for(int i = 0; i < n; i++) a[i] = s.nextLong();

            solve(a, n, l, r);
        }
    }

    public static void solve(long a[], int n, int l, int r) {
        int ans = 0, i = 0, j = 0;
        long sum = 0;

        while(i < n) {
            while(j < n && sum < l) {
                sum += a[j];
                j++;
            }

            if(sum >= l && sum <= r) {
                ans++;
                sum = 0;
                i = j;
            } else {
                sum -= a[i];
                i++;
            }
        }


        System.out.println(ans);
    }
}