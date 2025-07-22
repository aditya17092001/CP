import java.util.*;

public class C_Palindromic_Subsequences{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            solve(n);
        }
    }

    public static void solve(int n) {
        int a[] = new int[n];
        int k = ((n&1) == 0) ? n/2 : n/2+1;

        if((n&1) == 0) {
            a[0] = 1;
            for(int i = 1; i <= k; i++) a[i] = i;
            for(int i = k+1, j = 1; i < n; i++, j++) a[i] = j;
        }
        else {
            for(int i = 0; i < k; i++) a[i] = i+1;
            for(int i = k, j = 1; i < n; i++, j++) a[i] = j;
        }

        for(int i: a) System.out.print(i+" ");
        System.out.println();
    }
}

