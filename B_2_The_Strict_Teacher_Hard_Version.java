import java.util.*;
import java.io.*;

public class B_2_The_Strict_Teacher_Hard_Version {
    public static void main(String[] args) throws IOException {
        // Scanner s = new Scanner(System.in);
        // int t = s.nextInt();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-- > 0) {
            // int n = s.nextInt();
            // int m = s.nextInt();
            // int q = s.nextInt();

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());

            int teacher[] = new int[m];
            int student[] = new int[q];

            // for(int i = 0; i < m; i++) teacher[i] = s.nextInt();

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) teacher[i] = Integer.parseInt(st.nextToken());

            // for(int i = 0; i < q; i++) student[i] = s.nextInt();
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < q; i++) student[i] = Integer.parseInt(st.nextToken());
            solve(n, m, q, teacher, student);
        }
    }

    public static void solve(int n, int m, int q, int teacher[], int student[]) {
        Arrays.sort(teacher);

        StringBuilder s = new StringBuilder();
        for(int i: student) {
            int right = bSearch(teacher, i);
            if(right == 0) s.append((teacher[0]-1)+" "); 
            else if(right == m) s.append((n-teacher[right-1])+" ");
            else s.append(((teacher[right] - teacher[right-1])>>1)+" ");
        }
        System.out.println(s);
    }

    public static int bSearch(int teacher[], int ref) {
        int i = 0, j = teacher.length, ans = teacher.length;
        while(i < j) {
            int mid = (i + j) >> 1;
            if(teacher[mid] > ref) {
                ans = mid;
                j = mid;
            } else i = mid + 1;
        }
        return ans;
    }
}