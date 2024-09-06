import java.util.*;

public class B_Square_or_Not{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            s.nextLine();
            String st = s.nextLine();
            solve(n, st);
        }
    }
    
    public static void solve(int n, String st) {
        if(Math.sqrt(n)*Math.sqrt(n) == n) {
            n = (int) Math.sqrt(n);
            int ind = 0;
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    if(i == 0 || i == n-1 || j == 0 || j == n-1) {
                        if(st.charAt(ind) == '1') ind++;
                        else {
                            System.out.println("No");
                            return;
                        }
                    }
                    else if(st.charAt(ind) == '0') ind++;
                    else {
                        System.out.println("No");
                        return;
                    }
                }
            }
        }
        else {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }
}

