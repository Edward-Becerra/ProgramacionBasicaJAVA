public class Divisas {
    public static void main(String[] args){

        double pesoColombiano = 50000; // pesos colombianos
        double valorDollar = 10000; // dolares
        double dollar = 3770.79;  // valor de 1 peso colombiano en dolares

        double pesoADollar = pesoColombiano * dollar;
        double dollarApeso = (100 * pesoColombiano) / dollar;
        
         System.out.println("El valor de " + pesoColombiano + " pesos colombianos a dolares es de: " +  pesoADollar);
         System.out.println("El valor de " + valorDollar + " dolares a pesos colombianos  es de: " +  dollarApeso);
    }
    
}