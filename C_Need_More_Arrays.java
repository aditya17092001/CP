import java.util.*;

public class C_Need_More_Arrays{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
           int n = s.nextInt();
           int a[] = new int[n];
           for(int i = 0; i < n; i++) a[i] = s.nextInt();

           System.out.println(solve(a));
        }
    }

    public static int solve(int a[]) {
        ArrayList<Integer> l = new ArrayList<>();

        l.add(a[0]);
        
        int count = 0;
        for(int i = 1; i < a.length; i++) {
            if(l.get(count) != a[i]) {
                l.add(a[i]);
                count++;
            }
        }

        int dp[] = new int[l.size()];
        dp[0] = 1;

        for(int i = 1; i < dp.length; i++) {
            int prev = l.get(i-1), cur = l.get(i);
            if(prev+1 == cur) dp[i] = dp[i-1];
            else if(prev+1 < cur) dp[i] = dp[i-1]+1; 
            
            if(i > 1) dp[i] = Math.max(dp[i], dp[i-2]+1);
        }

        return dp[dp.length-1];
    }
}

