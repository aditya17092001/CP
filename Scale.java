import java.util.Scanner;

public class Scale {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i = 0; i < t; i++) {
            int n = s.nextInt();
            int k = s.nextInt();
            s.nextLine();
            int a[][] = new int[n][n];
            for(int j = 0; j < n; j++) {
                String temp = s.nextLine();
                for(int l = 0; l < temp.length(); l++) a[j][l] = (int) (temp.charAt(l)-'0');
            }
            solve(a, n, k);
        }
    }

    public static void solve(int a[][], int n, int k) {
        int ans[][] = new int[n/k][n/k];
        int row = 0;
        for(int i = 0; i < a.length; i+=k) {
            int col = 0;
            for(int j = 0; j < a.length; j+=k) {
                ans[row][col] = a[i][j];
                col++;
            }
            row++;
        }
        for(int i[]: ans) {
            for(int j: i) System.out.print(j);
            System.out.println();
        }
    }
}
