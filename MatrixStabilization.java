import java.util.Scanner;

public class MatrixStabilization {
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
            solve(a);
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) System.out.print(a[i][j]+" ");
                System.out.println();
            }
        }
    }

    public static void solve(int a[][]) {
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                int t[] = isGreater(i, j, a);
                if(t[0] == 1) {
                    a[i][j] = t[1];
                }
            }
        }
    }

    public static int[] isGreater(int i, int j, int a[][]) {
        int max = -1;
        if(i-1 >= 0 && a[i-1][j] < a[i][j]) max = Math.max(max, a[i-1][j]);
        else if(i-1 >= 0) return new int[]{0, -1};
        if(i+1 < a.length && a[i+1][j] < a[i][j]) max = Math.max(max, a[i+1][j]); 
        else if(i+1 < a.length) return new int[]{0, -1};
        if(j-1 >= 0 && a[i][j-1] < a[i][j]) max = Math.max(max, a[i][j-1]); 
        else if(j-1 >= 0) return new int[]{0, -1};
        if(j+1 < a[0].length && a[i][j+1] < a[i][j]) max = Math.max(max, a[i][j+1]);
        else if(j+1 < a[0].length) return new int[]{0, -1};
        return new int[]{1, max};
    }
}
