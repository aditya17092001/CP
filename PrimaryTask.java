import java.util.*;
public class PrimaryTask {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int a[] = new int[t];
        for(int i = 0; i < t; i++) a[i] = s.nextInt();
        for(int i = 0; i < a.length; i++) {
            String num = a[i]+"";
            if(num.length() >= 3) {
                if(!num.substring(0, 2).equals("10")) {
                    System.out.println("No");
                    continue;
                }
                char c = num.charAt(2);
                if(c == '0' || (c == '1' && num.length() == 3)) {
                    System.out.println("No");
                    continue;
                }
                System.out.println("Yes");
            }
            else System.out.println("No");
        }
    }
}