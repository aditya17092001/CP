import java.util.*;

public class B_Good_Start{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            long x[] = new long[4];
            long y[] = new long[4];

            for(int i = 0; i < 4; i++) x[i] = s.nextLong();
            for(int i = 0; i < 4; i++) y[i] = s.nextLong();

            System.out.println(solve(x, y));
        }
    }

    public static String solve(long x[], long y[]) {
        long w = x[0], h = x[1], a = x[2], b = x[3];
        long x1 = y[0], y1 = y[1], x2 = y[2], y2 = y[3];

        long diffx = Math.abs(x1-x2);
        long diffy = Math.abs(y1-y2);

        if(x1 == x2) return ((diffy%b) == 0) ? "YES" : "NO";
        if(y1 == y2) return ((diffx%a) == 0) ? "YES" : "NO";

        return ((diffy%b) == 0 || (diffx%a) == 0) ? "YES" : "NO";
    }
}

