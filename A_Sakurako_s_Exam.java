import java.util.*;

public class A_Sakurako_s_Exam{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int a = s.nextInt();
            int b = s.nextInt();
            int bleft = b%2;
            if(a >= bleft*2) {
                a -= (bleft*2); 
                b = 0;
            }
            else {
                System.out.println("NO");
                continue;
            }
            if(a%2 == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

