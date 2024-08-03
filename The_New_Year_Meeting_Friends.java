import java.util.Arrays;
import java.util.Scanner;

public class The_New_Year_Meeting_Friends {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[] = new int[3];
        for(int i = 0; i < a.length; i++) a[i] = s.nextInt();
        Arrays.sort(a);
        int ans = 0;
        ans += a[2]-a[1];
        ans += a[1]-a[0];
        System.out.println(ans);
    }
    
}
