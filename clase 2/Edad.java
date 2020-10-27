import java.util.Scanner;
    public class Edad {
        public static void main(String[]args){

            System.out.println("Ingrese su edad");
            System.out.println("---------------");

            Scanner leer = new Scanner(System.in);
            int edad = leer.nextInt();

            if(edad >= 1 && edad <= 10){
                System.out.println("Eres un niño");
            }

            if(edad >= 11 && edad <= 17){
                System.out.println("Eres adolescente");
            }

            if (edad >= 18 && edad <= 30) {
                System.out.println("Eres adulto");
            }

            if (edad >= 31 && edad <= 80) {
                System.out.println("Eres mayor");
            }               

            if(edad <= 0 || edad >= 81){
                System.out.println("No es posible la edad");
            }
        }
}