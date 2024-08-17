import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long k = s.nextInt();
        long n = s.nextInt();
        long w = s.nextInt();
        long sum = (w*(w+1))/2;
        sum *= k;
        long borrow = (n < sum) ? sum-n : 0;
        System.out.println(borrow);
    }
}
