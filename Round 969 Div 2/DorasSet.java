import java.util.Scanner;

public class DorasSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int count = 0;
            for(int i = l; i <= r; i++) {
                if(i%2 != 0) count++;
            }
            System.out.println(count/2);
        }
    }
}