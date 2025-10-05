import java.util.*;

public class D_A_and_B{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            s.nextLine();
            String st = s.nextLine();

            System.out.println(solve(n, st));
        }
    }

    public static long solve(int n, String st) {
        if(n < 3) return 0;

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            char c = st.charAt(i);

            if(c == 'a') a.add(i);
            else b.add(i);
        }

        return Math.min(count(a), count(b));
    }

    public static long count(ArrayList<Integer> a) {
        if(a.size() == 0) return 0;
        int mid = a.size()/2;
        int level = a.get(mid);
        long aMove = 0;

        for(int i = mid-1; i >= 0; i--) {
            aMove += (level-1-a.get(i));
            level--;
        } 

        level = a.get(mid);
        for(int i = mid+1; i < a.size(); i++) {
            aMove += (a.get(i)-(level+1));
            level++;
        }

        return aMove;
    }
}

