import java.util.*;

public class C_Leftmost_Below{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            long a[] = new long[n];

            for(int i = 0; i < n; i++) a[i] = s.nextLong();

            System.out.println(solve(a, n));
        }
    }

    public static String solve(long a[], int n) {
        long min = a[0];

        for(int i = 1; i < n; i++) {
            if(((min-1)+min) >= a[i]) min = Math.min(min, a[i]);
            else return "NO";
        }

        return "YES";
    }
}

