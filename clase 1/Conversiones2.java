import static java.lang.System.in;

import java.util.Scanner;

public class Conversiones2 {
    public static void main(final String[] args) {

        final Scanner sc = new Scanner(in);

            double valor;
            double valor2;
            double pulgada = 1;
            double centimetro = 2.54;

            System.out.println("Calculadora de pulgadas a centimetros");
            System.out.println("-------------------------------------");
            System.out.println("Dar pulgadas");
            valor = sc.nextDouble();

            System.out.println("-------------------------------------");
            System.out.println("Dar centimetros");
            valor2 = sc.nextDouble();

             double resultado = (valor * centimetro ) / pulgada;
             double resultado2 = (valor2 * pulgada) / centimetro;

        System.out.printf("%.2f pulgadas es igual a %.2f centimetros\n", valor, resultado );
        System.out.printf("%.2f centimetros es igual a %.2f pulgadas\n", valor2, resultado2);
        sc.close();
    }    
}