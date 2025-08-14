import java.util.*;

public class C_Uninteresting_Number{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine(); 
        while(t-- > 0) {
            String n = s.nextLine();
            System.out.println(solve(n));
        }
    }

    public static String solve(String n) {
        
        int two = 0, three = 0;

        long sum = 0;
        for(int i = 0; i < n.length(); i++) {
            int c = (n.charAt(i) - '0');
            if(c == 2) two++;
            else if(c == 3) three++;
            sum += c;
        }


        for(int i = 0; i <= two; i++) {
            for(int j = 0; j <= three; j++) {
                if((sum + (2*i) + (6*j)) % 9 == 0) return "YES";
            }
        }

        return "NO";
    }
}

