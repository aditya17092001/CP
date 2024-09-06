import java.util.*;

public class Sort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i = 0; i < t; i++) {
            int n = s.nextInt();
            int q = s.nextInt();
            s.nextLine();
            String str[] = new String[2];
            int a[][] = new int[q][2];
            for(int j = 0; j < 2; j++) str[j] = s.nextLine();
            for(int j = 0; j < q; j++) {
                for(int k = 0; k < 2; k++) a[j][k] = s.nextInt();
            }
            solve(str, a);
        }
    }

    public static void solve(String str[], int queries[][]) {
        int prefixA[][] = new int[26][str[0].length()+1];
        int prefixB[][] = new int[26][str[1].length()+1];

        String a = str[0], b = str[1];
        for(int i = 0; i < a.length(); i++) {
            int posA = (int) a.charAt(i)-'a';
            int posB = (int) b.charAt(i)-'a';
            prefixA[posA][i+1]++;
            prefixB[posB][i+1]++;
        }

        for(int i = 0; i < 26; i++) {
            for(int j = 1; j < a.length()+1; j++) {
                prefixA[i][j] += prefixA[i][j-1];
                prefixB[i][j] += prefixB[i][j-1];
            }
        }

        for(int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            int sum = 0;
            for(int j = 0; j < 26; j++) {
                sum += Math.abs(Math.abs(prefixA[j][end] - prefixA[j][start-1]) - Math.abs(prefixB[j][end] - prefixB[j][start-1]));
            }
            System.out.println(sum/2);
        }
    }
}