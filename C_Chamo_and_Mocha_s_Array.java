import java.util.*;

public class C_Chamo_and_Mocha_s_Array {
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
        if(n == 2) {
            System.out.println(Math.min(a[0], a[1]));
            return ;
        }

        int max = -1;

        for(int i = 0; i < n-2; i++) {
            int t[] = new int[3];
            t[0] = a[i];
            t[1] = a[i+1];
            t[2] = a[i+2];
            Arrays.sort(t);
            max = Math.max(max, t[1]);
        }

        System.out.println(max);
    }
}