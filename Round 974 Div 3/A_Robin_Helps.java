import java.util.*;

public class A_Robin_Helps{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int k = s.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++) a[i] = s.nextInt();
            solve(a, n, k);
        }
    }

    public static void solve(int a[], int n, int k) {
        int ans = 0, robinHas = 0; 
        for(int i: a) {
            if(i >= k) robinHas += i;
            else if(i == 0 && robinHas > 0) {
                ans++;
                robinHas--;
            }
        }
        System.out.println(ans);
    }
}

