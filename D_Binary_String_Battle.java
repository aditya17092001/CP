import java.util.*;

public class D_Binary_String_Battle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int k = s.nextInt();
            String st = s.next();
            solve(st, n, k);
        }
    }

    public static void solve(String s, int n, int k) {
        int ones = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1') ones++;
        }

        if(k >= ones) {
            System.out.println("Alice");
            return ;
        }

        System.out.println((((s.length()/2) + 1) <= k) ? "Alice" : "Bob");
    }
}

