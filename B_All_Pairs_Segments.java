import java.util.*;

public class B_All_Pairs_Segments {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int q = s.nextInt();
            long x[] = new long[n];
            long k[] = new long[q];

            for(int i = 0; i < n; i++) x[i] = s.nextLong();
            for(int i = 0; i < q; i++) k[i] = s.nextLong();

            solve(n, q, x, k);
        }
    }

    public static void solve(int n, int q, long x[], long k[]) {
        Arrays.sort(x);

        HashMap<Long, Integer> m = new HashMap<>();

        for(int i = 0; i < n; i++) {
            long t = (1L * (i + 1) * (n - i)) - 1;
            m.put(t, m.getOrDefault(t, 0) + 1);

            if(i > 0) {
                long t1 = 1L * (n - i) * i;
                int val = m.getOrDefault(t1, 0);
                m.put(t1, val + (int) (x[i]-x[i-1]-1));
            }
        }

        for(int i = 0; i < q; i++) System.out.print(m.getOrDefault(k[i], 0)+" ");
        System.out.println();
    }
}

