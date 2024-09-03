import java.util.*;

public class E_Klee_s_SUPER_DUPER_LARGE_Array{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int k = s.nextInt();
            long min = k;
            long max = k+n-1;
            long ans = Integer.MAX_VALUE;
            while(min < max) {
                long mid = min+(max-min)/2;
                long first = sum(k, mid);
                long second = sum(mid+1, k+n-1);
                if(sum(k, mid) < sum(mid+1, k+n-1)) min = mid+1;
                else max = mid;
                ans = Math.min(ans, Math.abs(second-first));
            }
            System.out.println(ans);

        }
    }

    public static long sum(long start, long end) {
        long n = end*(end+1)/2;
        long f = (start-1)*(start)/2;
        return n-f;
    }
}

