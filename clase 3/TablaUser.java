import java.util.Scanner;

public class TablaUser{

    public static void main(String[]args){

        Scanner leer = new Scanner(System.in);

        System.out.println("Tabla de multiplicar");
        System.out.println("--------------------");
        System.out.println("Digite la tabla que quiere conocer: ");

        int factor1 = leer.nextInt();

        System.out.println("Digite hasta donde quiere conocer sus multiplos: ");

        int factor2 = leer.nextInt();

        System.out.println("-------------------------------------------------");

        int resultado;

        for(int x = 1; x <= factor2; x++){

           resultado = factor1 * x;

           System.out.println( factor1 + " * " + x + " = " + resultado);
        }

        System.out.println("Termino");

    }
}