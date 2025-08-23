import java.util.*;

public class A_Swap_Columns_and_Find_a_Path {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int t = s.nextInt();
      
      while(t-- > 0) {
        int n = s.nextInt();
        
        int a[][] = new int[2][n];
        for(int i = 0; i < 2; i++) {
          for(int j = 0; j < n; j++) a[i][j] = s.nextInt();
        }
        
        solve(a, n);
      }
  }
  
  public static void solve(int a[][], int n) {
    if(n == 1) {
      System.out.println(a[0][0]+a[1][0]);
      return ;
    }
    
    long ans = Long.MIN_VALUE;
    
    for(int i = 0; i < n; i++) {
        long sum = a[0][i] + a[1][i];

        for(int j = 0; j < n; j++) {
            if(j == i) continue;
            sum += Math.max(a[0][j], a[1][j]);
        }
        ans = Math.max(ans, sum);
    }

    System.out.println(ans);        
  }
}