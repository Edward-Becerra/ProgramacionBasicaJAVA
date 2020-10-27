 

public class Conversiones {
    public static void main(String[] args){
        //2.54cms = 1 inch
        double valor = 10; // 10 centimetros
        double centimetros = 2.54;
        double pulgada = 1;
        double resultado = (valor * pulgada)/centimetros;

        System.out.println(resultado + " pulgadas");

        double valorPulgadas = 5;
        double resultado2 = (valorPulgadas * centimetros)/ pulgada;

        System.out.println(resultado2 +  " centimetros");

    }
}