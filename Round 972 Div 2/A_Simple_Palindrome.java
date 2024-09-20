import java.util.*;

public class A_Simple_Palindrome{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            solve(n);
        }
    }

    public static void solve(int n) {
        String s = "aeiou";
        if(n < 5) {
            System.out.println(s.substring(0, n));
            return ;
        }
        char vowels[] = new char[5];
        vowels[0] = 'a';
        vowels[1] = 'e';
        vowels[2] = 'i';
        vowels[3] = 'o';
        vowels[4] = 'u';

        StringBuilder ans = new StringBuilder();
        int ind = 0, each = n/5, i = 0, extra = n%5;
        while(i < n && ind < vowels.length) {
            for(int j = 0; j < each; j++) {
                ans.append(vowels[ind]);
                i++;
            }
            if(extra > 0) {
                ans.append(vowels[ind]);
                i++;
                extra--;
            }
            ind++;
        }
        while(i < n) {
            ans.append('u');
            i++;
        }
        System.out.println(ans);
    }
}

