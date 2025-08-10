import java.util.*;

public class D_This_Is_the_Last_Time{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int k = s.nextInt();
            int a[][] = new int[n][3];

            for(int i = 0; i < n; i++) {
                for(int j = 0; j < 3; j++) a[i][j] = s.nextInt();
            }

            solve(a, n, k);
        }
    }

    public static void solve(int a[][], int n, int k) {
        Comparator<int[]> comp = new Comparator<>(){
            public int compare(int a[], int b[]) {
                return Integer.compare(a[0], b[0]);
            }
        };

        PriorityQueue<int[]> q = new PriorityQueue<>(comp);

        for(int b[]: a) q.add(b);

        while(!q.isEmpty()) {
            int temp[] = q.poll();

            if(k < temp[2] && temp[0] <= k && k <= temp[1]) k = temp[2];
        }

        System.out.println(k);
    }
}

