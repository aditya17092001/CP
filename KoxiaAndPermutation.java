import java.util.Scanner;

public class KoxiaAndPermutation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int k = s.nextInt();
            solve(n, k);
        }
    }

    public static void solve(int n, int k) {
        int a[] = new int[n];
        int i = 1, j = n, ind = 0;
        for(; ind < n; ind++) {
            if(ind % 2 == 0) {
                a[ind] = j;
                j--;
            } else {
                a[ind] = i;
                i++;
            }
        }
        for(i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if(i < a.length-1) System.out.print(" ");
        }
        System.out.println();
    }
}
