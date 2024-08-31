import java.util.*;

public class C_Good_Prefixes{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
           int n = s.nextInt();
           long a[] = new long[n];
           for(int i = 0; i < n; i++) a[i] = s.nextLong();
           solve(a);
        }
    }

    public static void solve(long a[]) {
        long sum = 0, max = -1, ans = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i];
            max = Math.max(max, a[i]);
            if(sum - max == max) ans++;
        }
        System.out.println(ans);
    } 
}

