import java.util.*;

public class C_Robin_Hood_in_Town{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            long a[] = new long[n];
            for(int i = 0; i < n; i++) a[i] = s.nextLong();
            if(n <= 2) {
                System.out.println(-1);
                continue;
            }
            Arrays.sort(a);

            int mid = (n/2);

            long sum = 0;
            for(long i: a) sum += i;
            double average = ((double)sum/(double)n)/(double)2;
            
            long x = ((n*2)*a[n/2]) - sum;

            if(a[mid] <= average || x >= 0) System.out.println(Math.max(0, x+1));
            else System.out.println(-1);
        }
    }
}

