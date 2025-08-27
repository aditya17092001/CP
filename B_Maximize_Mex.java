import java.util.*;

public class B_Maximize_Mex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int x = s.nextInt();

            int a[] = new int[n];
            for(int i = 0; i < n; i++) a[i] = s.nextInt();

            System.out.println(solve(n, x, a));
        }
    }

    public static int solve(int n, int x, int a[]) {
        Arrays.sort(a);

        if(a[0] != 0) return 0;

        int freq[] = new int[n+1];

        for(int i: a) {
            if(i <= n) freq[i]++;
        }

        for(int i = 0; i < n; i++) {
            if(freq[i] == 0) return i;
            else if(freq[i] > 1 && i + x <= n) freq[i+x] += freq[i]-1;
        }

        return n;
    }
}

