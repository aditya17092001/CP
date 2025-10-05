import java.util.*;

public class C_Earning_on_Bets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int a[] = new int[n];
            
            for(int i = 0; i < n; i++) a[i] = s.nextInt();

            solve(a, n);
        }
    }

    public static void solve(int a[], int n) {
        int lcmV = a[0];

        for(int i = 1; i < n; i++) lcmV = lcm(lcmV, a[i]);

        int sum = 0;

        int ans[] = new int[n];

        for(int i = 0; i < n; i++) {
            int val = (lcmV/a[i]);
            sum += val;
            ans[i] = val;
        }


        if(sum < lcmV) {
            for(int i: ans) System.out.print(i+" ");
            System.out.println();
        } else System.out.println(-1);

    }

    public static int lcm(int a, int b) {
        return (a*b)/gcd(a, b);
    }

    public static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a%b);
    }
}