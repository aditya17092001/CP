import java.util.Scanner;

public class Fox_And_Snake {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int c = s.nextInt();
        boolean left = false;
        for(int i = 0; i < r; i++) {
            if(i % 2 == 0) {
                for(int j = 0; j < c; j++) System.out.print("#");
                System.out.println();
            }
            else {
                if(left) {
                    System.out.print("#");
                    for(int j = 1; j < c; j++) System.out.print(".");
                    System.out.println();
                    left = false;
                }
                else {
                    for(int j = 0; j < c-1; j++) System.out.print(".");
                    System.out.print("#");
                    System.out.println();
                    left = true;
                }
            }
        }
    }
}
