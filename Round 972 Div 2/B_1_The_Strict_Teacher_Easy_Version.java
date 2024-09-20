import java.util.*;

public class B_1_The_Strict_Teacher_Easy_Version{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int m = s.nextInt();
            int q = s.nextInt();
            int teachersPos[] = new int[2];
            for(int i = 0; i < 2; i++) teachersPos[i] = s.nextInt();
            int derekPos = s.nextInt();

            solve(n, m, q, teachersPos, derekPos);
        }
    }

    public static void solve(int n, int m, int q, int teachersPos[], int derekPos) {
        int firstTeacherDiff = Math.abs(teachersPos[0] - derekPos);
        int secondTeacherDiff = Math.abs(teachersPos[1] - derekPos);
        if(derekPos == teachersPos[0] || derekPos == teachersPos[1]) System.out.println(0);
        else if((derekPos <= teachersPos[0] && derekPos <= teachersPos[1]) || (derekPos >= teachersPos[0] && derekPos >= teachersPos[1])) System.out.println(Math.min(firstTeacherDiff, secondTeacherDiff));
        else if(firstTeacherDiff == 1 || secondTeacherDiff == 1) System.out.println(Math.max(firstTeacherDiff, secondTeacherDiff)+1);
        else {
            firstTeacherDiff--;
            secondTeacherDiff--;
            int ans = Math.abs(firstTeacherDiff-secondTeacherDiff);
            ans += (Math.min(secondTeacherDiff, firstTeacherDiff)+1)*2;
            System.out.println(ans-1);
        } 
    }
}
