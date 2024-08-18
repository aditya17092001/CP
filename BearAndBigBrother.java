import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int small = s.nextInt();
        int large = s.nextInt();
        int count = 0;
        while(small <= large) {
            small *= 3;
            large *= 2;
            count++;
        } 
        System.out.println(count);
    }
}