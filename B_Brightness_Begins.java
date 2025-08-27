import java.util.*;

public class B_Brightness_Begins {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            long n = s.nextLong();
            solve(n);
        }
    }

    public static void solve(long n) {
        if(n == 1) {
            System.out.println(2);
            return ;
        }
        long i = 1, j = (int) Math.pow(20, 18), ans = Long.MAX_VALUE;

        while(i <= j) {
            long mid = (i+j)>>1;

            long val = ((mid*mid) - 1) - (mid - 1) - n;
            if(val < 0) val = val - (mid*mid) - 1;
            else val = (mid*mid) - 1 - val;

            if(val <= 0) i = mid+1;
            else {
                ans = Math.min(ans, val);
                j = mid-1;
            }
        }

        System.out.println(ans);
    }
}

