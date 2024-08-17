import java.util.Arrays;
import java.util.Scanner;

public class Fun {
    // TLE
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i = 0; i < t; i++) {
            long n = s.nextLong();
            long x = s.nextLong();
            System.out.println(solve(n, x));
        }
    }

    public static long solve(long n, long x) {
        long start = x-2, count = 0;
        for(; start >= 1; start--) {
            for(long j = start; j >= 1; j--) count++;
        }
        return count;
    }
}
