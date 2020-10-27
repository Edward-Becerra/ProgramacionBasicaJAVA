import java.util.Scanner;

public class Media {
    public static void main(String[]args){

        Scanner leer = new Scanner(System.in);

        System.out.println("Cálculo de la Media");

        System.out.println("Cuantos valores tienes?");
        int total = leer.nextInt();

        double suma = 0;

        for(int x = 0; x < total; x++){
            
            System.out.println("Dar el valor " + (x+1) + " : ");
            int aux = leer.nextInt();
            suma = aux + suma;
            

            
        }
        double media = suma / total;
        System.out.println("La media es :" + media);
    }

}