import java.util.*;

// UNSOLVED
public class B_Add_0_or_K{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            long k = s.nextLong();

            long a[] = new long[n];
            for(int i = 0; i < n; i++) a[i] = s.nextLong();

            solve(a, n, k);
        }
    }

    public static void solve(long a[], int n, long k) {
        if(n == 1) {
            System.out.println(a[0]+k);
            return;
        }
        
        if((k&1) == 1) {
            for(long i: a) System.out.print((i&1) == 1 ? (i+k)+" " : i+" ");
        } else {
            long max = -1;
            for(long i: a) max = Math.max(max, i);

            for(int i = 0; i < n; i++) {
                for(long j = k, l = 0; j <= k*100 && l < k; j += k, l++) {
                    if((a[i]+j)%max == 0) {
                        a[i] = a[i]+j;
                        break;
                    }
                }
                max = Math.max(max, a[i]);
            }


            for(long i: a) System.out.print(i+" ");
        }

        System.out.println();
    }
}

