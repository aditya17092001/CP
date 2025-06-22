import java.util.*;

public class C_Asuna_and_the_Mosquitoes{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();

            long a[] = new long[n];
            for(int i = 0; i < n; i++) a[i] = s.nextLong();

            solve(a, n);
        }
    }

    public static void solve(long a[], int n) {
        PriorityQueue<Long> even = new PriorityQueue<Long>((b, c) -> (int) (c-b));
        PriorityQueue<Long> odd = new PriorityQueue<Long>((b, c) -> (int) (c-b));

        for(long i: a) {
            if((i&1) == 0) even.add(i);
            else odd.add(i);
        }

        if(even.isEmpty()) {
            System.out.println(odd.poll());
            return ;
        }

        if(odd.isEmpty()) {
            System.out.println(even.poll());
            return ;
        }
        
        while(!even.isEmpty()) {
            long e = even.poll(), o = odd.poll();
            odd.add(e+o);
        }

        long ans = odd.poll();

        while(!odd.isEmpty()) ans += (odd.poll()-1);

        System.out.println(ans);
    }
}

