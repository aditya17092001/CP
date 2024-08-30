import java.util.Arrays;
import java.util.Scanner;

public class TurtleandGoodPairs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            s.nextLine();
            String st = s.nextLine();
            char c[] = st.toCharArray();
            Arrays.sort(c);
            System.out.println(String.valueOf(c));
        }
    }
}
