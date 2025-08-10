import java.util.*;

public class B_Outstanding_Impressionist{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();

            int a[][] = new int[n][2];

            for(int i = 0; i < n; i++) {
                a[i][0] = s.nextInt();
                a[i][1] = s.nextInt();
            }

            solve(a, n);
        }
    }

    public static void solve(int a[][], int n) {
        int single[] = new int[(n*2)+1];
        int prefix[] = new int[(n*2)+1];
        int freq[] = new int[(n*2)+1];

        for(int b[]: a) {
            if(b[0] == b[1]) {
                if(single[b[0]] == 0) single[b[0]]++;
                freq[b[0]]++;
            }
        }

        prefix[0] = single[0];
        for(int i = 1; i < prefix.length; i++) prefix[i] = prefix[i-1] + single[i];

        StringBuilder ans = new StringBuilder();

        for(int b[]: a) {
            if(b[0] == b[1]) ans.append(((freq[b[0]] > 1) ? "0" : "1"));
            else {
                int count = b[1] - b[0] + 1;
                int prefixCount = (b[0] == 0) ? prefix[b[1]] : prefix[b[1]] - prefix[b[0]-1];
                ans.append(((count == prefixCount) ? "0" : "1"));
            }
        }
        System.out.println(ans);
    }
}

