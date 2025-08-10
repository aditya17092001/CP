import java.util.*;

public class D_Counting_Pairs{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            long x = s.nextLong();
            long y = s.nextLong();

            int a[] = new int[n];
            for(int i = 0; i < n; i++) a[i] = s.nextInt();

            solve(n, x, y, a);
        }
    }

    public static void solve(int n, long x, long y, int a[]) {
        Arrays.sort(a);

        long ans = 0, sum = 0;

        for(int i: a) sum += i;
        for(int i = 0; i < n-1; i++) {
            long r = rEnd(a[i], i+1, n-1, a, x, y, sum);
            long l = lEnd(a[i], i+1, (int) r, a, x, y, sum);
            ans += (r > 0 && l >= 0) ? (r-l+1) : 0;
        }
        
        System.out.println(ans);

    }

    public static long rEnd(int f, int i, int j, int a[], long x, long y, long sum) {
        long ans = -1; 
        
        while (i <= j) {
            int mid = (i + j) / 2;
            long add = sum - (f + a[mid]);
            
            if (add >= x && add <= y) {
                ans = mid;
                i = mid + 1;
            } 
            else if (add < x) j = mid - 1; 
            else i = mid + 1; 
        }
        
        return ans;
    }

    public static long lEnd(int f, int i, int j, int a[], long x, long y, long sum) {
        long ans = 0;
        while (i <= j) {
            int mid = (i + j) / 2;
            long add = sum - (f + a[mid]);
            
            if (add >= x && add <= y) {
                ans = mid;
                j = mid - 1;
            } 
            else if (add < x) j = mid - 1; 
            else i = mid + 1; 
        }

        return ans;
    }
}