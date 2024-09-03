import java.util.*;

public class osu_mania{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            s.nextLine();
            String str[] = new String[n];
            for(int i = 0; i < n; i++) str[i] = s.nextLine();
            for(int i = n-1; i >= 0; i--) {
                String st = str[i];
                for(int j = 0; j < st.length(); j++) {
                    if(st.charAt(j) == '#') System.out.print((j+1)+" ");
                }
            }
            System.out.println();
        }
    }
}

