import java.util.*;

public class C_Make_Equal_Again{
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
        if(a.length == 1) {
            System.out.println(0);
            return ;
        }
        int i = 0, j = a.length-1;

        while(i <= j && a[i] == a[0] && a[j] == a[0]) {
            if(i == j) {
                if(a[i] == a[i-1]) {
                    i++;
                    j--;
                }
                else break;
            }
            else {
                i++;
                j--;
            }
        }
        
        if(i == 0 && j == a.length-1) {
            while(i < a.length-1 && a[i] == a[0]) i++;
            while(j >= 1 && a[j] == a[a.length-1]) j--;
            if(i >= a.length-j) System.out.println((a.length-i));
            else System.out.println(j+1);
            return;
        }
        else {
            while(i < a.length && a[i] == a[0]) i++;
            while(j >= i && a[j] == a[a.length-1]) j--;
        }
        if(i <= j) System.out.println(j-i+1);
        else System.out.println(0);
    }
}

