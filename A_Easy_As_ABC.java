import java.util.*;

public class A_Easy_As_ABC{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        String s3 = s.nextLine();
        char c[][] = new char[3][3];

        for(int i = 0; i < 3; i++) {
            String st = "";
            if(i == 0) st = s1;
            else if(i == 1) st = s2;
            else st = s3;
            for(int j = 0; j < 3; j++) c[i][j] = st.charAt(j);
        }

        String ans[] = new String[1];
        ans[0] = "DDD";

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                int visited[][] = new int[3][3];
                visited[i][j] = 1;
                // System.out.println("New Calling......");
                solve(i, j, c, c[i][j]+"", ans, visited);
            }
        }

        System.out.println(ans[0]);
        
    }

    public static void solve(int i, int j, char arr[][], String str, String ans[], int visited[][]) {
        if(str.length() == 3) {
            if(compare(str, ans[0])) ans[0] = str;
            return ; 
        }

        int r[] = new int[]{0,-1,-1,-1,0,1,1,1};
        int c[] = new int[]{1,1,0,-1,-1,-1,0,1};

        for(int k = 0; k < r.length; k++) {
            int ni = i+r[k];
            int nj = j+c[k];

            if(ni >= 0 && ni < 3 && nj >= 0 && nj < 3 && visited[ni][nj] == 0) {
                visited[ni][nj] = 1;
                solve(ni, nj, arr, str+arr[ni][nj], ans, visited);
                visited[ni][nj] = 0;
                if(str.length() > 1) str = str.substring(0, str.length());
            }
        }
    }

    public static boolean compare(String s1, String s2) {
        for(int i = 0; i < 3; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if(c1 < c2) return true;
            else if(c1 > c2) return false;
            else if(c1 == c2) continue;
        }
        return false;
    }
}

