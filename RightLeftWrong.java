import java.util.*;
 
public class RightLeftWrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i = 0; i < t; i++) {
            int n = s.nextInt();
            int a[] = new int[n];
            char b[] = new char[n];
            for(int j = 0; j < n; j++) a[j] = s.nextInt();
            s.nextLine();
            String str = s.nextLine();
            for(int j = 0; j < n; j++) b[j] = str.charAt(j);
            solve(a, b);
        }
    }
 
    public static void solve(int a[], char b[]) {
        long ans = 0;
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> r = new ArrayList<>();
        long prefixSum[] = new long[a.length];
        prefixSum[0] = (long) a[0];
        for(int i = 0; i < a.length; i++) {
            if(i > 0) prefixSum[i] += prefixSum[i-1]+(long) a[i];
            if(b[i] == 'L') l.add(i);
            else r.add(i);
        }

        for(int i = 0, j = r.size()-1; i < l.size() && j >= 0; i++, j--) {
            int start = l.get(i), end = r.get(j); 
            if(start < end)
            {
                if(start > 0) ans += (prefixSum[end]-prefixSum[start-1]);
                else ans += prefixSum[end];
            }
            else break;
        }
        System.out.println(ans);
    }
}