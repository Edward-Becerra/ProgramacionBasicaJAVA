import java.util.StringTokenizer;
import java.util.Scanner;

public class Iniciales {
    public static void main(String[]args){

        Scanner leer = new Scanner(System.in);
        String miNombre = leer.nextLine();

        System.out.println(miNombre);
               
        StringTokenizer stMiNombre = new StringTokenizer(miNombre);
        String sNombre = null;

        while (stMiNombre.hasMoreTokens()) {
            sNombre = stMiNombre.nextToken();
            System.out.println(sNombre.substring(0, 1));
        }
    }
}
