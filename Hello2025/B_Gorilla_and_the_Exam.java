import java.util.*;

public class B_Gorilla_and_the_Exam{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
           int n = s.nextInt();
           int k = s.nextInt();
           int a[] = new int[n];

           for(int i = 0; i < n; i++) a[i] = s.nextInt();
           System.out.println(solve(a, n, k));
        }
    }

    public static int solve(int a[], int n, int k) {
        if(a.length == 1) return 1;
        HashMap<Integer, Integer> m = new HashMap<>();
        for(int i: a) m.put(i , m.getOrDefault(i, 0)+1);
        if(k == 0) return m.size();

        int val[] = new int[m.size()];
        int i = 0, j = 0;
        for(Map.Entry<Integer, Integer> map: m.entrySet()) val[i++] = map.getValue();
        Arrays.sort(val);
        i = 0;
        
        while(i < val.length && k >= val[i]) {
            k -= val[i];
            i++;
        }

        return Math.max(1, val.length-i);           
    }
}

