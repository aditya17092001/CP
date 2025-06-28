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
        for(i = 0; i < n-1; i+=2) {
            if(a[i] == 0 || a[i+1] == 0) {
                int start = i-skipped;
                q.add(start);
                q.add(i+1-skipped);
                skipped++;
            }
        }

        if((n&1) != 0 && a[n-1] == 0) {
            q.add(n-2-skipped);
            q.add(n-1-skipped);
            skipped++;
        }


        System.out.println(q.size()/2+1);
        while(!q.isEmpty()) System.out.println((q.poll()+1)+" "+(q.poll()+1));
        System.out.println(1+" "+(n-skipped));
    }
}