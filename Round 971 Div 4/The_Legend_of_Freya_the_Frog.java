import java.util.*;

public class The_Legend_of_Freya_the_Frog{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int x = s.nextInt();
            int y = s.nextInt();
            int k = s.nextInt();
            solve(x, y, k);
        }
    }

    public static void solve(int x, int y, int k) {
        int a = (x+k-1)/k;
        int b = (y+k-1)/k;
        if(a <= b) System.out.println((2*b));
        else System.out.println((2*a)-1);
    }
}

