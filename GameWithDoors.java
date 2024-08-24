// WA
import java.util.Scanner;

public class GameWithDoors {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int l = s.nextInt();
            int r = s.nextInt();
            int L = s.nextInt();
            int R = s.nextInt();
            System.out.println(solve(l, r, L, R));
        }
    }

    public static long solve(int l, int r, int L, int R) {
        int left = Math.max(l, L), right = Math.min(r, R);
        int min = Math.min(l, Math.min(r, Math.min(L, R)));
        int max = Math.max(l, Math.max(r, Math.max(L, R)));
        long ans = Math.abs(left-right);
        if(r >= L && R >= l) {
            if(min < left) ans++;
            if(max > right) ans++;
        }
        return ans;
    }
}



