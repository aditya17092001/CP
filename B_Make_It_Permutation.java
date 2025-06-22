import java.util.*;

public class B_Make_It_Permutation{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();

            solve(n);
        }
    }

    public static void solve(int n) {
        System.out.println(2*n-1);

        for(int i = 1; i < n; i++) {
            System.out.println(i+" "+1+" "+i);
            System.out.println(i+" "+(i+1)+" "+n);
        }
        System.out.println(n+" "+1+" "+n);
    }
}

