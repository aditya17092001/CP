import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        if(str.charAt(0) >= 'A' && str.charAt(0) <= 'Z') System.out.println(str);
        else {
            String first = str.substring(0, 1);
            first = first.toUpperCase();
            first += str.substring(1);
            System.out.println(first);
        }
    }
}
