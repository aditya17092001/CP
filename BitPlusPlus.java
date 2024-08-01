import java.util.Scanner;
public class BitPlusPlus {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String a[] = new String[n];
		for(int i = 0; i < n; i++) a[i] = s.next();
		int ans = 0;
		for(String st: a) {
			if(st.charAt(0) == '+' || st.charAt(st.length()-1) == '+') ans++;
			else ans--;
		}
		System.out.println(ans);
	}
}