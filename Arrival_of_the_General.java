import java.util.Scanner;

public class Arrival_of_the_General {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) a[i] = s.nextInt();
        int min = Integer.MAX_VALUE, minInd = -1, max = Integer.MIN_VALUE, maxInd = -1;
        for(int i = 0; i < n; i++) {
            if(min >= a[i]) {
                min = a[i];
                minInd = i;
            }
            if(max < a[i]) {
                max = a[i];
                maxInd = i;
            }
        }
        int ans = n-1-minInd;
        ans += (maxInd < minInd) ? maxInd : maxInd-1;
        System.out.println(ans);
    }
}
