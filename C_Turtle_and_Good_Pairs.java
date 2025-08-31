import java.util.*;

class Pair {
    char c;
    int freq;

    Pair(char c, int freq) {
        this.c = c;
        this.freq = freq;
    }
}

public class C_Turtle_and_Good_Pairs{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            s.nextLine();
            String st = s.nextLine();
            solve(n, st);
        }
    }

    public static void solve(int n, String s) {
        Pair a[] = new Pair[26];

        for(int i = 0; i < 26; i++) a[i] = new Pair((char) ('a'+i), 0);
        for(int i = 0; i < n; i++) a[s.charAt(i)-'a'].freq++;


        Comparator<Pair> comp = new Comparator<>(){
            public int compare(Pair a, Pair b) {
                return Integer.compare(b.freq, a.freq);
            }
        };

        Arrays.sort(a, comp);
        
        StringBuilder ans = new StringBuilder();

        while(ans.length() < n) {
            for(int i = 0; i < 26; i++) {
                if(a[i].freq == 0) break;
                ans.append(a[i].c+"");
                a[i].freq--;
            }
        }

        System.out.println(ans);
    }
}

