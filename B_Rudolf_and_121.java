import java.util.*;

public class B_Rudolf_and_121{
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
        for(int i = 1; i < a.length-1; i++) {
            // System.out.println("i: "+i);
            // for(int j: a) System.out.print(j+" ");
            // System.out.println();
            if(a[i-1] == 0) continue;
            else if((a[i] != 0 && a[i-1] == 0 && a[i+1] == 0) || a[i-1] != 0 && a[i] != 0 && a[i+1] == 0) {
                System.out.println("NO");
                return ;
            }
            else {
                int prev = a[i-1];
                int cur = a[i];
                int next = a[i+1];
                if(cur < prev*2 || next < prev) {
                    System.out.println("NO");
                    return;
                }
                a[i-1] = 0;
                a[i] -= prev*2;
                a[i+1] -= prev;
            }
        }

        for(int i: a) {
            if(i != 0) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}

