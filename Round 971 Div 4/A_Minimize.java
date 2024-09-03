import java.util.*;

public class A_Minimize{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
           int a = s.nextInt();
           int b = s.nextInt();
           int max = Math.max(a, b);
           int min = Math.min(a, b);
           System.out.println(max-min);
        }
    }
}

