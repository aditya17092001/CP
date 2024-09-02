import java.util.*;

public class B_378_QAQ_and_Mocha_s_Array {
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
        if(a[0] == 1) {
            System.out.println("Yes");
            return ;
        }
        int one = -1, two = -1;
        for(int i = 0; i < a.length; i++) {
            if(one == -1) one = a[i];
            else if(a[i] % one != 0 && two == -1) two = a[i];
            else if((a[i] % one == 0) || (a[i] % two == 0)) continue;
            else {
                System.out.println("No"); 
                return ;
            }
        }
        System.out.println("Yes");
    }
}

