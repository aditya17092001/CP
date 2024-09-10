import java.util.*;

public class B_Shifts_and_Sorting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        while(t-- > 0) {
            String st = s.nextLine();
            solve(st);
        }
    }

    public static void solve(String s) {
        long ans = 0, oneCount = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1') oneCount++;
            else if(oneCount > 0) ans += oneCount+1;
        }
        System.out.println(ans);
    }
}

