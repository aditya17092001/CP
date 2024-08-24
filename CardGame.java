import java.util.Scanner;

public class CardGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            int d = s.nextInt();
            solve(a, b, c, d);
        }
    }

    public static void solve(int a, int b, int c, int d) {
        int ans = 0;
        if((a > c && b >= d) || (a >= c && b > d)) ans++;
        if((b > c && a >= d) || (b >= c && a > d)) ans++;
        System.out.println(ans*2);
    }
}
