
public class NumerosParesFor {
    public static void main(String[]args){
        int limite = 100;
        
        System.out.println("Programa para imprimir los numeros pares hasta el 100");

        for (int i = 0; i <= limite; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}