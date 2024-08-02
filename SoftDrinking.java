import java.util.Scanner;

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[] = new int[8];
        for(int i = 0; i < a.length; i++) a[i] = s.nextInt();
        System.out.println(solve(a));
    }
    
    public static int solve(int a[]) {
        int drinks = a[1]*a[2];
        int b = drinks/a[6];
        int c = a[3]*a[4];
        int d = a[5]/a[7];
        return (Math.min(b, Math.min(c, d)))/a[0];        
    }
}
