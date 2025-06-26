import java.util.*;

public class D_Place_of_the_Olympiad{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int m = s.nextInt();
            int k = s.nextInt();

            solve(n, m, k);
        }
    }

    public static void solve(int n, int m, int k) {
        long l = 1, r = m;
        if(k == (long) (n*m)) {
            System.out.println(m);
            return;
        }

        long ans = Integer.MAX_VALUE;
        while(l <= r) {
            long mid = (l+r)/2;
            if(check(mid, n, m, k)) {
                ans = Math.min(ans, mid);
                r = mid-1;
            }
            else l = mid+1;
        }
 
        System.out.println(ans);
    }

    public static boolean check(long chunk, int n, int m, int k) {
        long fullChunk = (m/(chunk+1))*chunk, halfChunk = (m%(chunk+1));
        long placed = fullChunk + halfChunk;

        return ((placed * n) >= k);
    }
}

