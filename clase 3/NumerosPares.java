public class NumerosPares {
    public static void main(String[]args){
        System.out.println("Programa para imprimir los números pares hasta el 100");
        int num = 0;
        int limite=100;
        while (num <= limite){
            if(num % 2 == 0){
            System.out.println(num);
            }
        num++;
        }
   }
}