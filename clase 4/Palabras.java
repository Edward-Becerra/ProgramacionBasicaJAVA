import java.util.StringTokenizer;

public class Palabras {
        public static void main(String[] args) {

        String sTexto = "Edward Becerra";
        String sPalabra = null;
        StringTokenizer stPalabras = new StringTokenizer(sTexto);
        while (stPalabras.hasMoreTokens()) {
            sPalabra = stPalabras.nextToken();
            System.out.println(sPalabra.substring(0, 1));
        }

    }
    
}