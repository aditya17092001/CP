import java.util.*;

public class C_Those_Who_Are_With_Us{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int m = s.nextInt();

            int a[][] = new int[n][m];

            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) a[i][j] = s.nextInt();
            }

            solve(a, n, m);
        }
    }

    public static void solve(int a[][], int n, int m) {
        int max = -1;

        for(int b[]: a) {
            for(int i: b) max = Math.max(max, i);
        }

        int r[] = new int[n];
        int c[] = new int[m];
        int count = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(a[i][j] == max) {
                    count++;
                    r[i]++;
                    c[j]++;
                }
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                var remaining = r[i] + c[j] - ((a[i][j] == max) ? 1 : 0);
                if(remaining == count) {
                    System.out.println(max-1);
                    return ;
                }
            }
        }

        System.out.println(max);
    }
}

