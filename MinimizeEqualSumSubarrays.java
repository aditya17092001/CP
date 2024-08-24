import java.util.Scanner;

public class MinimizeEqualSumSubarrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++) a[i] = s.nextInt();
            int b[] = find(a);
            for(int i = 0; i < n; i++) {
                System.out.print(b[i]);
                if(i < n-1)System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static int[] find(int a[]) {
        int b[] = new int[a.length];
        for(int i = 0; i < a.length; i++) {
            if(a[i] == a.length) b[i] = 1;
            else b[i] = a[i]+1;
        } 
        return b;
    }
}
