import java.util.*;
 
public class C_Kevin_and_Binary_Strings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        while(t-- > 0) {
            String st = s.next();
            solve(st);
        }
    }
    public static void solve(String s) {
        int first = -1;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '0') {
                first = i;
                break;
            }
        }
        
        if(first == -1) {
            System.out.println("1 "+s.length()+" 1 1");
            return ;
        }

        StringBuilder fi = new StringBuilder("");
        int ans[] = new int[2];
        int len = s.length()-first;
        for(int i = 0; i+len-1 < s.length(); i++) {
            String si = s.substring(i, i+len);
            StringBuilder ti = new StringBuilder("");
            
            String zeros = "0";
            zeros = zeros.repeat(first);
            si = new StringBuilder(zeros+si).toString();
            compare(s, si, ti);

            if(fi.length() == 0) {
                fi = new StringBuilder(ti);
                ans[0] = 1;
                ans[1] = i+len;
            }

            int c1 = 0, c2 = 0;
            for(int j = 0; j < fi.length(); j++) {
                if(fi.charAt(j) == '0') c1++;
                if(ti.charAt(j) == '0') c2++;

                if(c2 < c1) {
                    fi = new StringBuilder(ti);
                    ans[0] = i+1;
                    ans[1] = i+len;
                } else if(c1 < c2) break;
            }
        }
        
        System.out.println("1 "+s.length()+" "+ans[0]+" "+ans[1]);
    }
    
    public static void compare(String s, String f, StringBuilder ans) {
        for(int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i), c2 = f.charAt(i);
            if(c1 != c2) ans.append("1");
            else ans.append("0");
        }
    }
}