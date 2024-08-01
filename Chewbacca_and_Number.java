import java.util.Scanner;
public class Chewbacca_and_Number {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		long ans = findMin(n);
		System.out.println(ans);
	}
	
	public static long findMin(long n) {
		long ans = 0, mul = 0;
		while(n > 0) {
			long rem = n % 10;
			long min = Math.min(rem, Math.abs(9-rem));
			if(n > 0 && n < 10 && min == 0) ans = (long) Math.pow(10, mul)*rem + ans; 
			else ans = (long) Math.pow(10, mul)*min + ans;
			n /= 10;
			mul++;
		}
		return ans;
	}
}