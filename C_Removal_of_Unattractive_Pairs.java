import java.util.*;

//WA
public class C_Removal_of_Unattractive_Pairs{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            s.nextLine();
            String st = s.nextLine();
            solve(st);
        }
        s.close();
    }

    public static void solve(String s) {
        HashMap<Character, Integer> m = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            m.put(c, m.getOrDefault(c, 0)+1);
        }

        Comparator<Pair> comparator = new Comparator<Pair>() {
            public int compare(Pair a, Pair b) {
                return Integer.compare(b.freq, a.freq);
            }
        };
        PriorityQueue<Pair> q = new PriorityQueue<>(comparator);

        for(Map.Entry<Character, Integer> map: m.entrySet()) q.add(new Pair(map.getKey(), map.getValue()));

        while(q.size() >= 2) {
            Pair first = q.poll();
            Pair second = q.poll();
            System.out.println(first.c+", "+first.freq+", "+second.c+", "+second.freq);
            if(first.freq == second.freq) continue;
            else q.add(new Pair(first.c, first.freq-second.freq));
        }

        System.out.println("Size: "+q.size());
        int sum = 0;
        if(!q.isEmpty()) sum += q.poll().freq;
        System.out.println(sum);
    }
}

class Pair{
    char c;
    int freq;
    Pair(char c, int freq) {
        this.c = c;
        this.freq = freq;
    }
}

