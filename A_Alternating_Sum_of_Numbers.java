import java.util.*;

public class A_Alternating_Sum_of_Numbers{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++) a[i] = s.nextInt();
            long even = 0, odd = 0;
            for(int i = 0; i < n; i++) {
                if(i % 2 == 0) even += a[i];
                else odd += a[i];
            }
            System.out.println(even-odd);
        }
    }
}

