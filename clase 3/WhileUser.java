import java.util.Scanner;

    public class WhileUser{
        public static void main(String[]args){

            Scanner leer = new Scanner(System.in);

            System.out.println("Tablas de multiplicar con While\n");
            System.out.println("*******************************");
            System.out.println("Digite un valor: ");

            int factor1 = leer.nextInt();

            int limite = 10;
            int contador = 1; 

            while(contador <= limite){                

                System.out.println(factor1 + " * " + contador + " = " + (factor1 * contador));

                contador++;

            }
            System.out.println("termino");
        }
    }