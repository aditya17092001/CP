import java.util.Scanner;
public class Beautiful_Matrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[][] = new int[5][5];
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) a[i][j] = s.nextInt();
        }

        int location[] = findOne(a);
        int colChange = Math.abs(location[0]-2);
        int rowChange = Math.abs(location[1]-2);
        System.out.println(colChange+rowChange);
    }

    public static int[] findOne(int a[][]) {
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a.length; j++) {
                if(a[i][j] == 1) return new int[]{i, j};
            }
        }
        return new int[]{-1,-1};
    }
}