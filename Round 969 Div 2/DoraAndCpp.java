// Wrong Anwer
import java.util.PriorityQueue;
import java.util.Scanner;

// public class DoraAndCpp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int a = s.nextInt();
            int b = s.nextInt();
            int ar[] = new int[n];
            for(int i = 0; i < n; i++) ar[i] = s.nextInt();
            solve(ar, a, b);
        }
    }

    public static void solve(int ar[], int a, int b) {
        PriorityQueue<Long> q = new PriorityQueue<>();
        long max = Integer.MIN_VALUE;
        for(int i: ar) {
            max = Math.max(max, i);
            q.add((long) i);
        }
        long ans = Integer.MAX_VALUE;
        while(true) {
            long cur = q.poll();
            if(cur+a >= q.peek() && cur+b >= q.peek()) {
                long added = 0;
                if(cur+a <= cur+b) added = cur+a;
                else added = cur+b;
                q.add(added);
                max = Math.max(max, added);
                if(ans < max-q.peek()) {
                    System.out.println(ans);
                    return ;
                }
                else ans = Math.min(ans, max-q.peek());
            }
            else {
                long added = Math.min(cur+a, cur+b);
                q.add(added);
                if(ans < max-added) {
                    System.out.println(ans);
                    return ;
                }
                else ans = Math.min(ans, max-added);       
            }
        }
    }
}
