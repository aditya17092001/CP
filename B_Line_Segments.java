import java.util.*;

public class B_Line_Segments{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            int d = s.nextInt();
            int e[] = new int[n];

            for(int i = 0; i < n; i++) e[i] = s.nextInt();
            solve(n, a, b, c, d, e);
        }
    }

    public static void solve(int n, int a, int b, int c, int d, int e[]) {
        if(a == b && b == c && c == d) {
            HashSet<Integer> h = new HashSet<>();
            for(int i: e) {
                if(h.contains(i)) h.remove(i);
                else h.add(i);
            }

            if(h.isEmpty()) System.out.println("Yes");
            else System.out.println("No");
            return;
        }

        double dist = distance(a, b, c, d);

        int sum = 0; 
        for(int i: e) sum += i;

        if(sum >= dist) System.out.println("Yes");
        else System.out.println("No");
    }

    public static double distance(int a, int b, int c, int d) {
        double x = (a-c)*(a-c);
        double y = (b-d)*(b-d);
        return Math.sqrt((x+y));
    }
}

