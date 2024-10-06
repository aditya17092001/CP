import java.util.*;

public class D_Slavic_s_Exam{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        while(t-- > 0) {
            String f = s.nextLine();
            String st = s.nextLine();
            solve(f, st);
        }
    }

    public static void solve(String a, String b) {
        char x[] = a.toCharArray();
        char y[] = b.toCharArray();

        int i = 0, j = 0;
        for(i = 0; i < x.length && j < y.length; i++) {
            if(x[i] == '?') {
                x[i] = y[j];
                j++;
            } else if(x[i] == y[j]) j++;
            // System.out.println(i+", "+j);
        }

        while(i < x.length) {
            if(x[i] == '?') x[i] = 'a';
            i++;
        }
        
        if(j == y.length) {
            System.out.println("YES");
            StringBuilder s = new StringBuilder();
            for(char c: x) s.append(c);
            System.out.println(s);
        } else {
            System.out.println("NO");
        }
    }
}

