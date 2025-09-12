import java.util.*;

public class B_Corner_Twist {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int m = s.nextInt();
            int a[][] = new int[n][m];
            int b[][] = new int[n][m];

            s.nextLine();
            for(int i = 0; i < n; i++) {
                String temp = s.nextLine();
                for(int j = 0; j < m; j++) a[i][j] = (int) temp.charAt(j)-'0';
            }

            for(int i = 0; i < n; i++) {
                String temp = s.nextLine();
                for(int j = 0; j < m; j++) b[i][j] = (int) temp.charAt(j)-'0';
            }

            System.out.println(solve(a, b, n, m));
        }
    }

    public static String solve(int a[][], int b[][], int n, int m) {
        int ar[] = new int[n];
        int br[] = new int[n];
        int ac[] = new int[m];
        int bc[] = new int[m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                ac[j] += a[i][j];
                bc[j] += b[i][j];
                ar[i] += a[i][j];
                br[i] += b[i][j];
            }
        }

        for(int i = 0; i < m; i++) {
            if(ac[i]%3 != bc[i]%3) return "NO";
        }

        for(int i = 0; i < n; i++) {
            if(ar[i]%3 != br[i]%3) return "NO";
        }

        return "YES";
    }
}