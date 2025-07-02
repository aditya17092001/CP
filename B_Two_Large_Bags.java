import java.util.*;

public class B_Two_Large_Bags {
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
        int freq[] = new int[1002];

        for(int i = 0; i < a.length; i++) freq[a[i]]++;

        for(int i = 1; i < freq.length; i++) {
            if(freq[i] != 0 && freq[i] < 2) {
                System.out.println("No");
                return ;
            } 

            if(freq[i]-2 > 0) freq[i+1] += (freq[i]-2);
        }

        System.out.println("Yes");
    }
}

