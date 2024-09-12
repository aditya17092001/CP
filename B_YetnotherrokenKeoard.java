import java.util.*;

public class B_YetnotherrokenKeoard{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        while(t-- > 0) {
            String st = s.nextLine();
            solve(st);
        }
    }

    public static void solve(String s) {
        Stack<Pair> capital = new Stack<>();
        Stack<Pair> small = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c >= 'a' && c <= 'z') {
                if(c == 'b') {
                    if(!small.isEmpty()) small.pop();
                }
                else small.push(new Pair(c, i));
            } else {
                if(c == 'B') {
                    if(!capital.isEmpty()) capital.pop();
                } 
                else capital.push(new Pair(c, i));
            }
        }

        StringBuilder ans = new StringBuilder();
        while(!small.isEmpty() && !capital.isEmpty()) {
            Pair sma = small.peek();
            Pair cap = capital.peek();
            if(sma.ind < cap.ind) {
                ans.append(cap.c);
                capital.pop();
            }
            else {
                small.pop();
                ans.append(sma.c);
            }
        }

        while(!capital.isEmpty()) ans.append(capital.pop().c);
        while(!small.isEmpty()) ans.append(small.pop().c);

        System.out.println(ans.reverse());
    }
}

class Pair {
    char c;
    int ind;
    Pair(char c, int ind) {
        this.c = c;
        this.ind = ind;
    }
}

