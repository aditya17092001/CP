import java.util.*;

public class C_Gorilla_and_Permutation{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int m = s.nextInt();
            int k = s.nextInt();
            int ans[] = new int[n];
            int max = n, min = 1;
            for(int i = 0; i < n; i++) {
                if(max > m) {
                    ans[i] = max;
                    max--;
                }
                else {
                    ans[i] = min;
                    min++;
                }
            }
            for(int i: ans) System.out.print(i+" ");
            System.out.println();
        }
    }
}

