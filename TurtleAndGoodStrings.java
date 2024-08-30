import java.util.Scanner;

public class TurtleAndGoodStrings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            s.nextLine();
            String st = s.nextLine();
            if(st.charAt(0) == st.charAt(n-1)) System.out.println("No");
            else System.out.println("Yes");
        }
    }
}
