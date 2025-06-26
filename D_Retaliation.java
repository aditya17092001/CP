import java.util.*;

public class D_Retaliation{
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
        long diff = a[1] - a[0];

        for(int i = 2; i < n; i++) {
            if(diff != a[i] - a[i-1]) return "NO";
        }

        if (diff < 0) a[0] = a[0] + diff * (n);
        else a[0] = a[0] - diff;


        return ((a[0] >= 0 && a[0] % (n + 1) == 0)) ? "YES" : "NO";
    } 
}

