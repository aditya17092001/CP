import java.util.*;

public class D_Mathematical_Problem{
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

    public static void solve(int n, String s) {
        if(s.length() == 2) {
            int i = 0;
            while(i < s.length() && s.charAt(i) == '0') i++;
            if(s.substring(i).length() > 0) System.out.println(s.substring(i));
            else System.out.println(0);
            return ;
        }
        else if(s.charAt(0) == '0' || s.charAt(s.length()-1) == '0') {
            System.out.println(0);
            return ;
        } 

        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < s.length()-1; i++) {
            int num = Integer.parseInt(s.substring(i, i+2));
            int sum = 0;
            for(int j = 0; j < i; j++) {
                if(s.charAt(j) == '0') {
                    System.out.println(0);
                    return ;
                }
                if(s.charAt(j) >= '2') sum += (int)s.charAt(j)-'0';
            }
            for(int j = i+2; j < s.length(); j++) {
                if(s.charAt(j) == '0') {
                    System.out.println(0);
                    return ;
                }
                if(s.charAt(j) >= '2') sum += (int)s.charAt(j)-'0';
            }
            if(num == 1 && sum > 0) num = sum;
            else num += sum;
            ans = Math.min(ans, num);
        }
        System.out.println(ans);
    }
}

