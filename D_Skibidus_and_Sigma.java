import java.util.*;

class Pair {
    long sum;
    int ind;

    Pair(long sum, int ind) {
        this.sum = sum;
        this.ind = ind;
    }
}

public class D_Skibidus_and_Sigma {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int m = s.nextInt();

            long a[][] = new long[n][m];

            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) a[i][j] = s.nextLong();
            }

            solve(a, n, m);
        }
    }

    public static void solve(long a[][], int n, int m) {
        List<Pair> l = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            long sum = 0;
            for(long j: a[i]) sum += j;
            l.add(new Pair(sum, i));
        }

        Comparator<Pair> comp = new Comparator<>(){
            public int compare(Pair a, Pair b) {
                return Long.compare(b.sum, a.sum);
            }
        };

        Collections.sort(l, comp);

        long sum = 0, ans = 0;
        for(Pair p: l) {
            for(long i: a[p.ind]) {
                sum += i;
                ans += sum;
            }
        }

        System.out.println(ans);
    }
}

