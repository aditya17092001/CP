import java.util.HashSet;
import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        HashSet<Character> h = new HashSet<>();
        for(int i = 0; i < st.length(); i++) h.add(st.charAt(i));
        String ans = (h.size()%2 == 0) ? "CHAT WITH HER!" : "IGNORE HIM!"; 
        System.out.println(ans);
    }
}
