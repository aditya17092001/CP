import java.util.*;

public class C_1_Shohag_Loves_XOR_Easy_Version {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		
		while(t-- > 0) {
		    long x = s.nextLong();
		    long m = s.nextLong();
		    solve(x, m);
		}
	}
	
	public static void solve(long x, long m) {
	    long ans = 0;
	    for(long i = 1; i <= Math.min(2*x, m); i++) {
	        long t = x^i;
	        if(t == 0 || x == i) continue;
	        if(i%t == 0 || x%t == 0) ans++;
	    }
	    System.out.println(ans);
	}
}

