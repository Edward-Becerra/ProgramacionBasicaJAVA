import java.util. Scanner;

    public class Calculadora {
        public static void main(String[]args){

            System.out.println("Calculadora Basica");
            System.out.println("------------------\n");
            System.out.println("Seleccione una opcion: \n");
            System.out.println("1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n");
                        
            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();
            double cantidad1, cantidad2, resultado;

            switch(opcion){
                case 1:
                System.out.println("Suma: \n");
                System.out.println("Digite un valor: \n");
                cantidad1 = sc.nextDouble();
                System.out.println("Digite el valor a sumar: \n");
                cantidad2 = sc.nextDouble();
                resultado = (cantidad1 + cantidad2);
                System.out.printf("%.2f + %.2f es igual a %.2f\n", cantidad1, cantidad2, resultado);
                break;

                case 2:
                System.out.println("Resta: \n");
                System.out.println("Digite un valor: \n");
                cantidad1 = sc.nextDouble();
                System.out.println("Digite el valor a restar: \n");
                cantidad2 = sc.nextDouble();
                resultado = (cantidad1 - cantidad2);
                System.out.printf("%.2f - %.2f es igual a %.2f\n", cantidad1, cantidad2, resultado);
                break;

                case 3:
                System.out.println("Multiplicacion: \n");
                System.out.println("Digite un valor: \n");
                cantidad1 = sc.nextDouble();
                System.out.println("Digite el valor por el cual multiplicar: \n");
                cantidad2 = sc.nextDouble();
                resultado = (cantidad1 * cantidad2);
                System.out.printf("%.2f * %.2f es igual a %.2f\n", cantidad1, cantidad2, resultado);
                break;
                
                case 4:
                System.out.println("Division: \n");
                System.out.println("Digite un valor: \n");
                cantidad1 = sc.nextDouble();
                System.out.println("Digite el valor por el cual dividir: \n");
                cantidad2 = sc.nextDouble();
                resultado = (cantidad1 / cantidad2);
                System.out.printf("%.2f / %.2f es igual a %.2f\n", cantidad1, cantidad2, resultado);
                break;

                default:
                System.out.println("Opcion invalida, por favor ingrese una opcion valida. \n");

            }    
      
        }
   
}