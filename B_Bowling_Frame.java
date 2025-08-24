import java.util.*;

public class B_Bowling_Frame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            long w = s.nextLong();
            long b = s.nextLong();
            solve(w, b);
        }
    }

    public static void solve(long w, long b) {
        long ans = 0;

        long i = 1, j = (long) Math.pow(10, 9);
        while(i <= j) {
            long mid = (i + j)/2;

            if(w+b >= (mid * (mid+1))/2) {
                ans = mid;
                i = mid+1;
            } else j = mid - 1;
        }

        System.out.println(ans);
    }
}

