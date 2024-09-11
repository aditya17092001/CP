import java.util.*;

public class B_Permutation_Printing{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int start = 1, end = n;
            for(int i = 1; i <= n; i++) {
                if((i&1) == 0) {
                    System.out.print(start+" ");
                    start++;
                }
                else {
                    System.out.print(end+" ");
                    end--;
                }
            }
            System.out.println();
        }
    }
}

