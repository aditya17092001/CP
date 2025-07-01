import java.util.*;

public class B_Set_of_Strangers{
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
    int r[] = new int[]{-1,0,1,0};
    int c[] = new int[]{0,-1,0,1};
    
    
    HashSet<Integer> colors = new HashSet<>();
    HashSet<Integer> problem = new HashSet<>();
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < m; j++) {
        int val = a[i][j];
        colors.add(val); 
        for(int k = 0; k < 4; k++) {
          int ni = i+r[k], nj = j+c[k];
          
          if(ni >= 0 && ni < n && nj >= 0 && nj < m && a[ni][nj] == val) problem.add(val);
        }
      }
    }
    
    System.out.println(problem.size()+colors.size()-1 - ((!problem.isEmpty()) ? 1 : 0));
  }
}