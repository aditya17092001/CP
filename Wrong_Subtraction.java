import java.util.*;
public class Wrong_Subtraction {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        System.out.println(solve(n, k));
    }

    public static int solve(int n, int k) {
        while(n > 0 && k > 0) {
            int rem = n % 10;
            if(rem > 0) n--;
            else n /= 10;
            k--;
        }
        return n;
    }
}
