import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[][] = new int[n][2];
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) a[i][j] = s.nextInt();
        }
        int max = a[0][1], passCount = a[0][1];
        for(int i = 1; i < n; i++) {
            passCount -= a[i][0];
            passCount += a[i][1];
            max = Math.max(max, passCount);
        }
        System.out.println(max);
    }
}
