import java.util.*;

public class SeatingInABus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i = 0; i < t; i++) {
            int n = s.nextInt();
            int a[] = new int[n];
            for(int j = 0; j < n; j++) a[j] = s.nextInt();
            if(canSeat(a)) System.out.println("Yes");
            else System.out.println("No");
        }
    }

    public static boolean canSeat(int a[]) {
        HashSet<Integer> h = new HashSet<>();
        for(int i = 0; i < a.length; i++) {
            if(h.size() == 0) h.add(a[i]);
            else {
                if(h.contains(a[i]-1) || h.contains(a[i]+1)) h.add(a[i]);
                else return false;
            }
        }
        return true;
    }
}