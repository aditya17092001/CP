import java.util.*;

public class B_Collatz_Conjecture {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int x = s.nextInt();
            int y = s.nextInt();
            int k = s.nextInt();

            System.out.println(solve(x, y, k));
        }
    }

    public static int solve(int x, int y, int k) {
        while(k > 0) {
            // System.out.println(x+", "+k);
            int rem = x % y;
            if(x == 1) return 1+k%(y-1);
            if(y-rem > k) return x+k;
            else {
                x += (y-rem);
                k -= (y-rem);
                while(x%y == 0) x /= y;
            }
        }

        return x;
    }
}

