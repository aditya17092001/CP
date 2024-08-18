import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char c[] = str.toCharArray();
        int sorted = c.length;
        while(sorted >= 0) {
            for(int i = 0; i < sorted-2; i+=2) {
                if(c[i] > c[i+2]) {
                    char temp = c[i];
                    c[i] = c[i+2];
                    c[i+2] = temp;
                }
            }
            sorted -= 2;
        }
        for(char i: c) System.out.print(i);
    }
}
