import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TurtleandPiggyArePlayingaGame2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++) a[i] = s.nextInt();
            solve(a);
        }
    }

    public static void solve(int a[]) {
       Arrays.sort(a);
       System.out.println(a[a.length/2]);
    }
}
