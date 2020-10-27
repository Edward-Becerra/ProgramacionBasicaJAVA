import java.util.Scanner;

    public class Divisas {

        public static void main(String[]args){

            Scanner leer = new Scanner(System.in);

            System.out.println("----------------------");
            System.out.println("Calculadora de Divisas");
            System.out.println("----------------------");
            System.out.println("1. Dolares a pesos COP");
            System.out.println("2. Pesos COP a dolares");

            int opcion = leer.nextInt();
            double cantidad; 

            double dolares = 1; 
            double pesosCop = 3715.25;

            switch (opcion){
                case 1:
                System.out.println("Dolares a pesos COP");
                System.out.println("Cúantos dolares tienes?");
                cantidad = leer.nextDouble();
                cantidad = (cantidad * pesosCop)/dolares;
                System.out.printf("Tienes %.2f pesos COP\n", cantidad);
                break;

                case 2: 
                System.out.println("Pesos COP a dolares");
                System.out.println("Cúantos pesos COP tienes?");
                cantidad = leer.nextDouble();
                cantidad = (cantidad * dolares)/pesosCop;
                System.out.printf("Tienes %.2f dolares\n", cantidad);
                break;

                default: 
                System.out.println("La opcion no es valida.");

            }


        }
    
    }