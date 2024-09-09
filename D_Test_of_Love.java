import java.util.*;

public class D_Test_of_Love {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int m = s.nextInt();
            int k = s.nextInt();
            s.nextLine();
            String st = s.nextLine();
            // HashMap<Integer, HashMap<Integer, Boolean>> dp = new HashMap<>();
            // System.out.println((solve(-1, n, m, k, st, dp) == true ? "YES" : "NO"));
            System.out.println((solve(n, m, k, st) == true ? "YES" : "NO"));
        }
    }

    public static boolean solve(int n, int m, int k, String st) {
        st = "L"+st+"L";
        n += 2;
        boolean ans = true;
        int i = 0;
        while(i < n-1) {
            char c = st.charAt(i);
            if(c == 'L') {
                boolean found = false;
                for(int j = i+1; j < n && j <= i+m; j++) {
                    if(st.charAt(j) == 'L') {
                        i = j;
                        found = true;
                        break;
                    }
                }
                if(!found) {
                    i += m;
                    if(st.charAt(i) == 'C') return false;
                }
            }
            else {
                i++;
                if(st.charAt(i) == 'C') return false;
                k--;
            }
        }
        return (ans && k >= 0) ? true :  false;
    }
    // public static boolean solve(int pos, int n, int m, int k, String s,  HashMap<Integer, HashMap<Integer, Boolean>> dp) {
    //     if(pos >= n) return true; 
    //     if(dp.containsKey(pos) && dp.get(pos).containsKey(k)) return dp.get(pos).get(k);
    //     if(pos != -1 && s.charAt(pos) == 'C') return false;
    //     boolean ans = false;
    //     if(pos != -1 && s.charAt(pos) == 'W') {
    //         if(k > 0) ans = solve(pos+1, n, m, k-1, s, dp);
    //         else return false;
    //     }
    //     else {
    //         for(int i = pos+1; i <= (pos+m); i++) ans = ans || solve(i, n, m, k, s, dp);
    //     }
    //     if(dp.containsKey(pos)) dp.get(pos).put(k, ans); 
    //     else {
    //         dp.put(pos, new HashMap<>());
    //         dp.get(pos).put(k, ans);
    //     }
    //     return ans;
    // }

    // public static void solve(int n, int m, int k, String s) {
    //     if(m > n) {
    //         System.out.println("YES");
    //         return;
    //     }
    //     int ind = 0, lt = -1, wt = -1;
    //     for(int i = Math.min(m-1, n-1); i >= 0; i--) {
    //         char c = s.charAt(i);
    //         if(lt == -1 && c == 'L') lt = i;
    //         else if(wt == -1 && c == 'W') wt = i;
    //         else if(lt != -1 && wt != -1) break;
    //     }

    //     if(lt != -1) ind = lt;
    //     else if(wt != -1) ind = wt;

    //     while(ind < n) {
    //         // System.out.println(ind);
    //         char c = s.charAt(ind);
    //         if(c == 'L') {
    //             if(ind+m >= n) {
    //                 System.out.println("YES");
    //                 return ;
    //             }

    //             int li = -1, wi = -1;
    //             for(int i = ind+m; i >= ind+1; i--) {
    //                 if(s.charAt(i) == 'L') {
    //                     li = i;
    //                     break;
    //                 }
    //                 else if(s.charAt(i) == 'W') wi = i;  
    //             }
    //             if(li != -1) ind = li;
    //             else if(wi != -1 && k > 0) {
    //                 ind = wi;
    //                 k--;
    //             }
    //             else {
    //                 System.out.println("NO");
    //                 return ;
    //             }

    //             // System.out.println("First: "+li+", "+wi);
    //         }
    //         else if(c == 'W') {
    //             if(ind+1 == n) {
    //                 System.out.println("YES");
    //                 return ;
    //             }
    //             for(int i = ind+1; i < n && k >= 0; i++) {
    //                 // System.out.println("Second: "+ind);
    //                 if(s.charAt(i) == 'W') {
    //                     k--;
    //                     ind++;
    //                 }
    //                 else if(s.charAt(i) == 'L') {
    //                     ind = i;
    //                     break;
    //                 }
    //                 else {
    //                     System.out.println("NO");
    //                     return;
    //                 }
    //             }
    //         }
    //         else {
    //             System.out.println("NO");
    //             return;
    //         }
    //     }
    // }
}

