import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------");
        System.out.println("Calculadora Basica");
        System.out.println("------------------");
        System.out.println("Digite un numero: ");
        System.out.println("------------------");

        double num1 = sc.nextDouble();

        System.out.println("Que operacion desea realizar?\n\n1) Suma\n2) Resta\n3) Multiplicacion\n4) Division");
        System.out.println("------------------");

        int operacion = sc.nextInt();

        if (operacion == 1) {
            System.out.println("Ha elegido SUMA\n\nDigite el numero que desea adicionar: ");
            double num2 = sc.nextDouble();

            double resultadoSuma = (num1 + num2);
            
            System.out.println("------------------");
            System.out.printf("La adicion entre %.2f y %.2f da como resultado %.2f\n", num1, num2, resultadoSuma);

        } else if (operacion == 2) {
            System.out.println("Ha elegido RESTA\n\nDigite el numero que desea sustraer: ");
            double num3 = sc.nextDouble();

            double resultadoResta = (num1 - num3);

            System.out.println("------------------");
            System.out.printf("La sustraccion entre %.2f y %.2f da como resultado %.2f\n", num1, num3, resultadoResta);
        } else if (operacion == 3) {
            System.out.println("Ha elegido MULTIPLICACION\n\nDigite el numero por el cual desea muliplicar: ");
            double num4 = sc.nextDouble();

            double resultadoProducto = (num1 * num4);

            System.out.println("------------------");
            System.out.printf("El producto entre %.2f y %.2f da como resultado %.2f\n", num1, num4, resultadoProducto);
        } else if (operacion == 4) {
            System.out.println("Ha elegido DIVISION\n\nDigite el numero por el cual desea dividir: ");
            double num5 = sc.nextDouble();

            double resultadoDivision = (num1 / num5);

            System.out.println("------------------");
            System.out.printf("el resultado de la division entre %.2f y %.2f es %f", num1, num5, resultadoDivision);
        } else {
            System.out.println("OPCION INVALIDA!\n\npor favor inserte una opcion valida.");
        }
        sc.close();
    }
}