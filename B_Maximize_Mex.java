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

        HashMap<Integer, Integer> m = new HashMap<>();

        ArrayList<Integer> l = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            m.put(a[i], m.getOrDefault(a[i], 0) + 1);
            if(i > 0 && a[i-1] == a[i]) l.add(a[i]);
        }

        if(!m.containsKey(0)) return 0; 

        for(int i = 0; i < l.size(); i++) {
            int j = 1;
            while(true) {
                int t = (x*j) + l.get(i);
                if(t > n || !m.containsKey(t)) {
                    m.put(t, 1);
                    break;
                }
                j++;
            }
        }

        int ans = -1; 

        for(int i = 0; i <= n; i++) {
            if(!m.containsKey(i)) {
                ans = i;
                return ans;
            }
        }

        return ans == -1 ? n : ans;
    }
}

