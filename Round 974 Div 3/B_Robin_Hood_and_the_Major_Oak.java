import java.util.*;

public class B_Robin_Hood_and_the_Major_Oak{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int k = s.nextInt();

            int startEven = (n - k)/2;
            int totalEven = n/2;
            totalEven -= startEven;
            int totalNumbers = k;
            int totalOdd = totalNumbers - totalEven;

            // System.out.println(totalEven+" "+totalOdd+", "+totalNumbers);
            if((totalOdd&1) == 0) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}

