import java.util.Scanner;// Importar la librería

    public class Leer{ // Inicia la Clase

        public static void main(String[]args){ // Inicia método main

            Scanner scanner = new Scanner(System.in);// creando instancia SIEMPRE!!

            System.out.println("Cual es tu edad?"); // Impresión a pantalla
            int edad = scanner.nextInt();  // usuario ingresa dato, en la variable 
            //edad se va almacenar el objeto scanner y llama a su metodo nexnInt

           System.out.println("Yo tambien tengo " + edad + " años");//imprime datos 
            
           System.out.println("Cual es tu peso?");
           double peso = scanner.nextDouble();

           System.out.println("Yo peso " + (peso + 5) + " kilos");

           System.out.println("Cual es tu nombre?");
           String nombre = scanner.next();

           System.out.println("Mi nombre es Edward, mucho gusto, " + nombre);


        } // Cierra Método 
    }// Cierra clase