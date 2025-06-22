import java.util.*;

public class A_MEX_Table{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
           int n = s.nextInt();
           int m = s.nextInt();
           System.out.println(1+Math.max(n, m));
        }
    }

}

