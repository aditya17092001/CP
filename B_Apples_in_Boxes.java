import java.util.*;

public class B_Apples_in_Boxes{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int k = s.nextInt();

            int a[] = new int[n];
            for(int i = 0; i < n; i++) a[i] = s.nextInt();    
            solve(n, k, a);
        }
    }

    public static void solve(int n, int k, int a[]) {
        Arrays.sort(a);

        long sum = 0;
        for(int i: a) sum += i;

        a[n-1]--;
        Arrays.sort(a);

        if(a[n-1] - a[0] > k || (sum&1) == 0) System.out.println("Jerry");
        else System.out.println("Tom");
    }
}

