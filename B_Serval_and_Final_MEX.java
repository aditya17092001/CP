import java.util.*;

public class B_Serval_and_Final_MEX{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++) a[i] = s.nextInt();

            solve(a, n);
        }
    }

    public static void solve(int a[], int n) {
        int skipped = 0;
        Queue<Integer> q = new LinkedList<>();

        int i = 0;
        for(i = 0; i < n; i++) {
            if(a[i] == 0) {
                int start = i-skipped;
                q.add(start);
                while(i < n && a[i] == 0) i++;
                if(i == n && (start+skipped) != (i-1)) {
                    q.add(i-1-skipped);
                    skipped = skipped + ((i-1-skipped) - start);
                }
                else if((start+skipped) != (i-1)){
                    q.add(i-skipped);
                    skipped = skipped + ((i-skipped) - start);
                }
            }
        }

        while(!q.isEmpty()) System.out.println((q.poll()+1)+" "+(q.poll()+1));
        System.out.println(1+" "+(n-skipped));
    }
}

