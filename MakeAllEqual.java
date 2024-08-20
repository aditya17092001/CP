import java.util.HashMap;
import java.util.Scanner;

public class MakeAllEqual {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++) a[i] = s.nextInt();
            System.out.println(solve(a));
        }
    }

    public static int solve(int a[]) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int max = 0;
        for(int i: a) {
            m.put(i, m.getOrDefault(i, 0)+1);
            max = Math.max(max, m.get(i));
        }
        return a.length-max;
    }
}
