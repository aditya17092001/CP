import java.util.*;

public class B_Substring_and_Subsequence{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        while(t-- > 0) {
            solve(s.nextLine(), s.nextLine());
        }
    }

    public static void solve(String a, String b) {
        int count = 0;

        for(int i = 0; i < b.length(); i++) {
            int t = 0;
            for(int j = 0, k = i; j < a.length() && k < b.length(); j++) {
                if(a.charAt(j) == b.charAt(k)) {
                    t++;
                    k++;
                }
            }
            count = Math.max(count, t);
        }

        System.out.println(a.length()+b.length()-count);
    }
}

