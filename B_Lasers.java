import java.util.*;

public class B_Lasers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            long a[] = new long[4];
            for(int i = 0; i < 4; i++) a[i] = s.nextLong();

            long x[] = new long[(int) a[0]];
            long y[] = new long[(int) a[1]];

            for(int i = 0; i < x.length; i++) x[i] = s.nextLong();
            for(int i = 0; i < y.length; i++) y[i] = s.nextLong();

            solve(a, x, y);
        }
    }

    public static void solve(long a[], long x[], long y[]) {
        System.out.println(x.length+y.length);
    } 
}

