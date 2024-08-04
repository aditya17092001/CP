import java.util.Scanner;

public class Anton_and_Polyhedrons {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String type[] = new String[n];
        s.nextLine();
        for(int i = 0; i < type.length; i++) type[i] = s.nextLine();
        int sum = 0;
        for(int i = 0; i < type.length; i++) {
            String fig = type[i];
            if(fig.equals("Tetrahedron")) sum += 4;
            else if(fig.equals("Cube")) sum += 6;
            else if(fig.equals("Octahedron")) sum += 8;
            else if(fig.equals("Dodecahedron")) sum += 12;
            else if(fig.equals("Icosahedron")) sum += 20;
        }
        System.out.println(sum);
    }
}
