import java.util.*;


public class A_1_Balanced_Shuffle_Easy{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        Pair a[] = new Pair[st.length()];
        for(int i = 0; i < a.length; i++) {
            char c = st.charAt(i);
            if(i == 0) a[i] = new Pair(c, 0);
            else if(a[i-1].c == ')') a[i] = new Pair(c, a[i-1].prefixBalance-1);
            else a[i] = new Pair(c, a[i-1].prefixBalance+1);
        }        
        
        Comparator<Pair> comparator = new Comparator<Pair>() {
            public int compare(Pair a, Pair b) {
                if(a.prefixBalance == b.prefixBalance) {
                    if (a.c == '(' && b.c == ')') return -1;
                    if (a.c == ')' && b.c == '(') return 1;
                    return 0;
                }
                return Integer.compare(a.prefixBalance, b.prefixBalance);
            }            
        };
        
        
        Arrays.sort(a, comparator);
        StringBuilder ans = new StringBuilder();
        for(Pair p: a) ans.append(p.c);
        
        System.out.println(ans);
    }
}


class Pair {
    char c;
    int prefixBalance;
    Pair(char c, int prefixBalance) {
        this.c = c;
        this.prefixBalance = prefixBalance;
    }
}