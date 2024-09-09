import java.util.*;

public class C_Update_Queries{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int m = s.nextInt();
            s.nextLine();
            String a = s.nextLine();
            int arr[] = new int[m];
            for(int i = 0; i < m; i++) arr[i] = s.nextInt();
            s.nextLine();
            String b = s.nextLine();

            solve(a, arr, b);
        }
    }

    public static void solve(String a, int arr[], String b) {
        char c1[] = a.toCharArray();
        char c2[] = b.toCharArray(); 
        Arrays.sort(arr);
        Arrays.sort(c2);
        int c2Ind = 0;
        HashSet<Integer> h = new HashSet<>();
        for(int i: arr) h.add(i);
        for(int i = 0; i < c1.length; i++) {
            if(h.contains(i+1)) c1[i] = c2[c2Ind++];
        }
        System.out.println(String.valueOf(c1));
    }
}

