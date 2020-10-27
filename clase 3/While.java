public class While {
    public static void main(String[]args){

        int tabla = 9;
        int limite = 10; 
        int contador = 1; 

        while(contador <= limite){

            System.out.println( tabla + " * " + contador + " = " + (tabla * contador));
            contador++;
        }
        System.out.println("Termino");
    }
}