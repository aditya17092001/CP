import java.util.*;

public class C_Choose_the_Different_Ones{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int m = s.nextInt();
            int k = s.nextInt();
            int a[] = new int[n];
            int b[] = new int[m];
            for(int i = 0; i < n; i++) a[i] = s.nextInt();
            for(int i = 0; i < m; i++) b[i] = s.nextInt();

            solve(a, b, n, m, k);
        }
    }

    public static void solve(int a[], int b[], int n, int m, int k) {
        HashSet<Integer> h = new HashSet<>();
        for(int i: a) {
            if(i <= k) h.add(i);
        }

        if(h.size() < k/2) {
            System.out.println("NO");
            return ;
        }

        HashSet<Integer> temp = new HashSet<>();
        
        for(int i: b) {
            if(i <= k) {
                h.add(i);
                temp.add(i);
            }
        }
        
        if(temp.size() < k/2) {
            System.out.println("NO");
            return ;
        }
        if(h.size() == k) System.out.println("YES");
        else System.out.println("NO");
    }
}

