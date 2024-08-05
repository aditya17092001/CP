import java.util.Scanner;

public class In_Search_of_an_Easy_Problem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) a[i] = s.nextInt();
        for(int i: a) {
            if(i == 1) {
                System.out.println("HARD");
                return;
            }
        }
        System.out.println("EASY");
    }
}
