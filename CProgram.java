import java.util.*;

public class CProgram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int a = s.nextInt();
            int b = s.nextInt();
            int n = s.nextInt();
            int count = 0;
            while(a <= n && b <= n) {
                if(a < b) a += b;
                else b += a;
                count++;
            }
            System.out.println(count);
        }
    }
}
