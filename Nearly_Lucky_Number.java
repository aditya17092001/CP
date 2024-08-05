import java.util.Scanner;

public class Nearly_Lucky_Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == '7' || c == '4') count++;
        }
        if(count == 4 || count == 7) System.out.println("YES");
        else System.out.println("NO");
    }
}
