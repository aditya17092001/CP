import java.util.*;

public class B_Line_Segments{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            int d = s.nextInt();
            int e[] = new int[n];

            for(int i = 0; i < n; i++) e[i] = s.nextInt();
            System.out.println(solve(n, a, b, c, d, e));
        }
    }

    public static String solve(int n, int a, int b, int c, int d, int e[]) {
        double dist = distance(a, b, c, d);
        
        long max = 0, sumOuter = 0, sumInner = 0;
        for(int i: e) {
            sumOuter += i;
            max = Math.max(max, i);
        }
        sumInner = Math.max(2 * max - sumOuter, 0);

        if((sumOuter * sumOuter < dist) || (sumInner * sumInner > dist)) return "No";

        return "Yes";
    }

    public static double distance(int a, int b, int c, int d) {
        double dx = (double) a - c;
        double dy = (double) b - d;
        return ((dx * dx) + (dy * dy));
    }
}