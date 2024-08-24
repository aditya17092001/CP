import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class K_Sort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            long a[] = new long[n];
            for(int i = 0; i < n; i++) a[i] = s.nextLong();
            if(a.length == 1) System.out.println(0);
            else System.out.println(solve(a));
        }
    }

    public static long solve(long a[]) {
        ArrayList<Long> diff = new ArrayList<>();
        for(int i = 1; i < a.length; i++) {
            if(a[i-1] > a[i]) {
                diff.add(a[i-1]-a[i]);
                a[i] = a[i-1];
            }
        }
        Collections.sort(diff);
        ArrayList<Long> aDiff = new ArrayList<>();
        if(diff.size() > 0) aDiff.add(diff.get(0));
        for(int i = 1; i < diff.size(); i++) aDiff.add(diff.get(i)-diff.get(i-1));
        long ans = 0, ind = aDiff.size()+1;
        for(long i: aDiff) {
            ans += (i*ind);
            ind--;
        }
        return ans;
    }
}
