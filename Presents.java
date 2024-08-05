import java.util.*;

public class Presents {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) a[i] = s.nextInt();
        HashMap<Integer, ArrayList<Integer>> m = new HashMap<>();
        for(int i = 0; i < n; i++) {
            m.put(a[i], new ArrayList<Integer>());
            m.get(a[i]).add(i+1);
        }
        ArrayList<Integer> key = new ArrayList<>(m.keySet());
        Collections.sort(key);
        for(int i = 0; i < key.size(); i++) {
            ArrayList<Integer> temp = m.get(key.get(i));
            for(int j = 0; j < temp.size(); j++) System.out.print(temp.get(j)+" ");
        }
    } 
}
