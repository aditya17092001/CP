import java.util.*;

public class C_Cirno_and_Operations{
    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0) {
		    int n = s.nextInt();
		    long a[] = new long[n];
		    
		    for(int i = 0; i < n; i++) a[i] = s.nextLong();
		    
		    solve(n, a);
		}
	}
	
	public static void solve(int n, long a[]) {
	    long ans = Long.MIN_VALUE;
	    
	    int len = n;
	    for(int i = 0; i < n; i++) {
	        long sum = 0;
	        for(int j = 0; j < len; j++) sum += a[j];
	        
	        if(i > 0) ans = Math.max(ans, Math.max(sum, -sum));
	        else ans = sum;
	        
	        for(int j = 0; j < len-1; j++) a[j] = a[j+1] - a[j];
	        len--;
	    }
	    
	    System.out.println(ans);
	}
}

