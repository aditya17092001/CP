import java.util.*;

public class B_Fibonacci_Cubes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int m = s.nextInt();
            int a[][] = new int[m][3];
            for(int i = 0; i < m; i++) {
                for(int j = 0; j < 3; j++) a[i][j] = s.nextInt();
            }
            solve(a, n, m);
        }
    }

    public static void solve(int a[][], int n, int m) {
        int fn = 1, fm = 2;
        for(int i = 2; i <= n; i++) {
            int temp = fn+fm;
            fn = fm;
            fm = temp;
        }

        StringBuilder ans = new StringBuilder();
        for(int b[]: a) {
            Arrays.sort(b);
            if(b[0] >= fn && b[1] >= fn && b[2] >= fm) ans.append("1");
            else ans.append("0");
        }

        System.out.println(ans);
    }
}

