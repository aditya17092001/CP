import java.util.*;

public class D_Sakurako_s_Hobby{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
           int n = s.nextInt();
           int a[] = new int[n];
           for(int i = 0; i < n; i++) a[i] = s.nextInt();
           s.nextLine();
           String str = s.nextLine();
           solve(a, str);
        }
    }

    public static void solve(int a[], String str) {
        int dp[] = new int[a.length+1];
        Arrays.fill(dp, -1);
        for(int i = 1; i < dp.length; i++) {
            if(dp[i] != -1) System.out.print(dp[i]+" ");
            else {
                int count = str.charAt(i-1) == '0' ? 1 : 0;
                HashSet<Integer> h = new HashSet<>();
                ArrayList<Integer> l = new ArrayList<>();
                h.add(i);
                l.add(i);
                int val = a[i-1];
                while(!h.contains(val)) {
                    h.add(val);
                    l.add(val);
                    if(str.charAt(val-1) == '0') count++;
                    val = a[val-1];
                }
                for(int k: l) dp[k] = count;
                System.out.print(count+" ");
            }
        }
        System.out.println();
    }
}

