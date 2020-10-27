import java.util.Scanner;

public class AprobadoReprobado{

    public static void main(String[]args){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Cual es tu calificacion?");
        System.out.println("------------------------");

        double calificacion = leer.nextDouble();

        if (calificacion >= 6){
            System.out.println("Haz Aprobado"); 
        }

        if(calificacion < 6){
            System.out.println("No aprobado");
        }

        leer.close();
    }
}