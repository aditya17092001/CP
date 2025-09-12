import java.util.*;

public class E_Secret_Box {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        while(t-- > 0) {
            long x = s.nextLong();
            long y = s.nextLong();
            long z = s.nextLong();
            long k = s.nextLong();

            solve(x, y, z, k);
        }
    }

    public static void solve(long x, long y, long z, long k) {
        long ans = 0;

        for(int m = 1; m <= x; m++) {
            for(int n = 1; n <= y; n++) {
                if(k % (m * n) != 0) continue;

                long o = k / (m * n);
                if(o > z) continue;

                long a = (x-m+1), b = (y-n+1), c = (z-o+1);

                ans = Math.max(ans, (a*b*c));
            }
        }

        System.out.println(ans);
    }
}