import java.util.*;

public class B_Swap_and_Delete{
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
        int n = s.length();
        int zero = 0, one = 0;

        for(int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if(c == '0') zero++;
            else one++;
        }

        if(zero == one) {
            System.out.println(0);
            return ;
        }

        int ans = 0;
        for(int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if(c == '0' && one > 0) one--;
            else if(c == '1' && zero > 0) zero--;
            else if(one == 0 || zero == 0) {
                System.out.println(n-i);
                return ;
            }
        }

        System.out.println(ans);

    }
}

