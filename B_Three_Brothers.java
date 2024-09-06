import java.util.*;

public class B_Three_Brothers{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[] = new int[2];
        for(int i = 0; i < 2; i++) a[i] = s.nextInt();
        Arrays.sort(a);
        for(int i = 0; i < 2; i++) {
            if(a[i]-1 == i) continue;
            else {
                System.out.println(i+1);
                return ;
            }
        }
        System.out.println(3);
    }
}

