import java.util.*;
public class C_Equal_Values
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0) {
		    int n = s.nextInt();
		    long a[] = new long[n];
		    
		    for(int i = 0; i < n; i++) a[i] = s.nextLong();
		    System.out.println(solve(a));
		}
	}
	
	public static long solve(long a[]) {
	    long ans = Long.MAX_VALUE;
	    
	    int i = 0;
	    while(i < a.length-1) {
	        int count = 1;
	        while(i < a.length-1 && a[i] == a[i+1]) {
	            i++;
	            count++;
	        }
	        ans = Math.min(ans, (long) (a[i] * (a.length-count)));
	        i++;
	    }
	    
	    i = a.length-1;
	    int count = 1;
	    while(i > 0 && a[i] == a[i-1]) {
	        count++;
	        i--;
	    }
	    
	    ans = Math.min(ans, (long) (a[i]*(a.length-count)));
	    
	    return ans;
	}
}