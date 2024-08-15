import java.util.Scanner;

public class Legs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 0; i < n; i++)solve(s.nextInt());

    }

    public static void solve(int n) {
        int cows = 0, chickens = 0;
        int rem = n%4;
        cows = n/4;
        chickens = rem/2;
        System.out.println((cows+chickens));
    }
}
