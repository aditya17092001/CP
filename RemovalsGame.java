// import java.util.Scanner;

// public class RemovalsGame {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         int t = s.nextInt();
//         while(t-- > 0) {
//             int n = s.nextInt();
//             int a[] = new int[n];
//             int b[] = new int[n];
//             for(int i = 0; i < n; i++) a[i] = s.nextInt();
//             for(int i = 0; i < n; i++) b[i] = s.nextInt();
//             solve(a, b, n);
//         }
//     }

//     public static void solve(int a[], int b[], int n) {
//         int c[] = new int[b.length];
//         for(int i = 0; i < b.length; i++) c[i] = b[b.length-1-i];
//         if(check(a, b) || check(a, c)) System.out.println("Bob");
//         else System.out.println("Alice");
//     }

//     public static boolean check(int a[], int b[]) {
//         for(int i = 0; i < a.length; i++){
//             if(a[i] != b[i]) return false;
//         }
//         return true;
//     }
// }



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RemovalsGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] a = new int[n];
            int[] b = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) b[i] = Integer.parseInt(st.nextToken());
            solve(a, b, n);
        }
    }

    public static void solve(int[] a, int[] b, int n) {
        if (check(a, b, n) || checkReversed(a, b, n)) System.out.println("Bob");
        else System.out.println("Alice");
    }

    public static boolean check(int[] a, int[] b, int n) {
        for (int i = 0; i < n; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static boolean checkReversed(int[] a, int[] b, int n) {
        for (int i = 0; i < n; i++) {
            if (a[i] != b[n - 1 - i]) return false;
        }
        return true;
    }
}
