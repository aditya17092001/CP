import java.util.*;

public class C_Longest_Good_Array{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int l = s.nextInt();
            int r = s.nextInt();
            solve(l, r);
        }
    }

    public static void solve(int l, int r) {
        if(l == r) System.out.println(1);
        else if(r-l == 1) System.out.println(2);
        else {
            int count = 0;
            int ind = 1;
            while(l <= r) {
                l += ind;
                count++;
                ind++;
            }
            System.out.println(count);
        }
    }
}

