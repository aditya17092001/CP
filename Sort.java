import java.util.*;

public class Sort {
    public static void main(String[] args) {
        // TLE
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i = 0; i < t; i++) {
            int n = s.nextInt();
            int q = s.nextInt();
            s.nextLine();
            String str[] = new String[2];
            int a[][] = new int[q][2];
            for(int j = 0; j < 2; j++) str[j] = s.nextLine();
            for(int j = 0; j < q; j++) {
                for(int k = 0; k < 2; k++) a[j][k] = s.nextInt();
            }
            int diff[] = new int[n];
            fillDiff(n, q, str, diff);
            solve(a, diff);
        }
    }

    public static void fillDiff(int n, int q, String str[], int diff[]) {
        String first = str[0], second = str[1];
        HashMap<Character, Integer> f = new HashMap<>();
        HashMap<Character, Integer> s = new HashMap<>();
        int fcount = 0, scount = 0;
        for(int i = 0; i < first.length(); i++) {
            char c1 = first.charAt(i), c2 = second.charAt(i);
            if(s.containsKey(c1)) {
                int val = s.get(c1);
                if(val > 1) s.put(c1, val-1);
                else s.remove(c1);
                scount--;   
            }
            else {
                f.put(c1, f.getOrDefault(c1, 0)+1);
                fcount++;
            }
            if(f.containsKey(c2)) {
                int val = f.get(c2);
                if(val > 1) f.put(c2, val-1);
                else f.remove(c2);   
                fcount--;
            }
            else {
                s.put(c2, s.getOrDefault(c2, 0)+1);
                scount++;
            }
            diff[i] = Math.max(f.size(), s.size());

        }
        // for(int i: diff) System.out.print(i+" ");
        // System.out.println();
    }

    public static void solve(int a[][], int diff[]) {
        for(int i = 0; i < a.length; i++) {
            int start = a[i][0], end = a[i][1];
            if(start == 1) System.out.println(diff[end-1]);
            else if(start > 1) System.out.println(Math.abs(diff[start-2]-diff[end-1]));
        }
    }
}