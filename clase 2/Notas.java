import java.util.Scanner;

public class Notas {
    public static void main(String[]args){

        System.out.println("Bienvenido a su calculador de nota final");
        System.out.println("----------------------------------------");

        Scanner sc = new Scanner(System.in);     
         
        System.out.println("Digite su nota de primer corte: ");
        System.out.println("---------------------------------");
        double nota1 = sc.nextDouble();

        System.out.println("Digite su nota de segundo corte: ");
        System.out.println("---------------------------------");
        double nota2 = sc.nextDouble();

        System.out.println("Digite su nota de tercer corte: ");
        System.out.println("---------------------------------");
        double nota3 = sc.nextDouble();

        double notaFinal = (nota1 + nota2 + nota3) / 3;


        if (notaFinal == 0 && notaFinal < 6) {

            System.out.printf("Su nota Final es de %.2f\n", notaFinal);
            System.out.println("Te falto esforzarte mas. ");
        }

        if ( notaFinal >= 6 && notaFinal < 7) {
            System.out.printf("Su nota Final es de %.2f\n", notaFinal);
            System.out.println("Pasaste raspando. ");
        }

        if (notaFinal >= 7 && notaFinal < 8) {
            System.out.printf("Su nota Final es de %.2f\n", notaFinal);
            System.out.println("Animo. ");
        }

        if (notaFinal >= 8 && notaFinal < 9) {
            System.out.printf("Su nota Final es de %.2f\n", notaFinal);
            System.out.println("Bien!, pero puedes mejorar. ");
        }

        if (notaFinal >= 9 && notaFinal <= 10) {
            System.out.printf("Su nota Final es de %.2f\n", notaFinal);
            System.out.println("Excelente desempeño!!!!. ");
        }

        if(notaFinal < 0 || notaFinal > 10) {
            System.out.println("lo siento, valores ingresados no son validos. ");
        }
        sc.close();
    }   
}