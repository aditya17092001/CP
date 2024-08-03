import java.util.ArrayList;
import java.util.Scanner;

public class Sum_of_Round_Numbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) a[i] = s.nextInt();
        for(int i = 0; i < n; i++) {
            ArrayList<Integer> l = solve(a[i]);
            System.out.println(l.size());
            for(int j: l) System.out.print(j+" ");
            System.out.println();
        }
    }

    public static ArrayList<Integer> solve(int n) {
        ArrayList<Integer> l = new ArrayList<>();
        int pow = 0;
        while(n > 9) {
            int rem = n % 10;
            if(rem > 0) l.add(rem*(int)Math.pow(10, pow));
            pow++;
            n /= 10;
        }
        if(n > 0) l.add(n*(int)Math.pow(10, pow));
        return l;
    }
}
