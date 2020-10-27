import java.util.Scanner; //importa scanner

public class Divisas2 {// inicia clase
    public static void main(String[]args){// inicia metodo    

        Scanner sc = new Scanner(System.in);//crear instancia

        double dolar = 1;
        double pesoColombiano = 3725.50;
        double valorPesos;
        double valorDolares;

        System.out.println("Conversion divisas");
        System.out.println("------------------");
        System.out.println("Digite valor en pesos colombianos: ");
        valorPesos = sc.nextDouble();//toma el valor 

        System.out.println("------------------");
        System.out.println("Digite valor en dolares: ");
        valorDolares = sc.nextDouble();// toma el valor

        double resultadoApesos = (valorDolares * pesoColombiano) / dolar;
        double resultadoAdolar = (valorPesos * dolar ) / pesoColombiano;

        System.out.printf(" %.2f pesos colombianos equivalen a %.2f dolares \n", valorPesos, resultadoAdolar); //imprime valor
        System.out.printf(" %.2f dolares equivalen a %.2f pesos colombianos \n", valorDolares, resultadoApesos);// imprime valor

        sc.close();//cierra instancia
    }// cierra metodo
}//cierra clase