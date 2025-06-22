import java.util.*;

public class B_Slice_to_Survive{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
           long r = s.nextLong();
           long c = s.nextLong();
           long rr = s.nextLong();
           long rc = s.nextLong();

           solve(r, c, rr, rc);
        }
    }

    public static void solve(long r, long c, long rr, long rc) {
        long ans = 1;

        long leftr = rc, rightr = c-rc+1, upc = rr, downc = r-rr+1;
        // System.out.println("Robot: "+rr+", "+rc);
        // System.out.println("Size: "+r+", "+c);
        // System.out.println("Before: "+leftr+", "+rightr+", "+upc+", "+downc);

        long maxr = Math.max(upc, downc);
        long maxc = Math.max(leftr, rightr);

        if(maxr > maxc) r = Math.min(upc, downc);
        else c = Math.min(leftr, rightr);

        while(r > 2 && c > 2) {
            if(r >= c) r = (r/2) + 1;
            else c = (c/2) + 1;
            ans++;
        }

        while(r != 1 || c != 1) {
            if(r >= c) {
                if((r&1) == 0) r /= 2;
                else r = (r/2) + 1;
            } else {
                if((c&1) == 0) c /= 2;
                else c = (c/2) + 1;
            }
            ans++;
        }
        System.out.println(ans);
    }
}

