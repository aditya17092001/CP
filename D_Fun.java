import java.util.*;

public class D_Fun{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            long n = s.nextLong();
            long x = s.nextLong();
            long ans = 0;
            for(long a = 1; a <= n; a++) {
                for(long b = 1; a * b <= n; b++) {
                    long ub = Math.min((n-(a*b))/(a+b), x-a-b);
                    if(ub >= 1) ans += ub;
                }
            }
            System.out.println(ans);
        }
        s.close();
    }
}

