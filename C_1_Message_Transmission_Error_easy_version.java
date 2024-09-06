import java.util.*;

public class C_1_Message_Transmission_Error_easy_version{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int n = str.length()/2;
        for(int i = n; i > 0; i--) {
            String b = str.substring(i);
            String a = str.substring(0, b.length());
            if(a.equals(b) && b.length()-1 >= i) {
                System.out.println("YES");
                System.out.println(a);
                return ;
            }
        }
        System.out.println("NO");
    }
}

