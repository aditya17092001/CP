// import java.util.Arrays;
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         int t = s.nextInt();
//         while(t-- > 0) {
//             int n = s.nextInt();
//             int m = s.nextInt();
//             long a[] = new long[n];
//             for(int i = 0; i < n; i++) a[i] = s.nextLong();
//             long max = Integer.MIN_VALUE;
//             for(long i: a) max = Math.max(max, i);
//             for(int i = 0; i < m; i++) {
//                 char c = s.next().charAt(0);
//                 int l = s.nextInt();
//                 int r = s.nextInt();
//                 if(max >= l && max <= r) {
//                     if(c == '+') max++;
//                     else max--;
//                 }
//                 System.out.print(max);
//                 if(i < m-1) System.out.print(" ");              
//             }
//             System.out.println();
//         }
//     }
// }


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class IndexAndMaximumValue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        
        while(t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            long[] a = new long[n];
            
            st = new StringTokenizer(br.readLine());
            long max = Long.MIN_VALUE;
            for(int i = 0; i < n; i++) {
                a[i] = Long.parseLong(st.nextToken());
                max = Math.max(max, a[i]);
            }
            
            for(int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                char c = st.nextToken().charAt(0);
                int l = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());
                
                if(max >= l && max <= r) {
                    if(c == '+') max++;
                    else max--;
                }
                
                sb.append(max);
                if(i < m-1) sb.append(" ");
            }
            sb.append("\n");
        }
        
        System.out.print(sb.toString());
    }
}
