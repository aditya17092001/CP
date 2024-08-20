import java.util.Scanner;

public class MaximumIncrease {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) a[i] = s.nextInt();
        System.out.println(solve(a));
    }

    public static int solve(int a[]) {
        int ans = 0, count = 1;
        for(int i = 1; i < a.length; i++) {
            if(a[i] > a[i-1]) count++;
            else {
                ans = Math.max(ans, count);
                count = 1;
            }
        }
        ans = Math.max(ans, count);
        return ans;
    }
}
